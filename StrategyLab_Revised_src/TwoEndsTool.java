import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class TwoEndsTool implements Tool {
	private List<TwoEndsShape> shapes = new ArrayList<TwoEndsShape>();
	protected int xStart, yStart;
	private int shapeType;
	protected Graphics onscreen, offscreen;
	public TwoEndsTool() {
		shapes.add(new LineShape());
		shapes.add(new RectShape());
		shapes.add(new OvalShape());
	}
	public void setShapeType(int type) {
		shapeType = type;
	}
	public TwoEndsShape getShape(int type) {
		return shapes.get(type);
	}
	public void mousePressed(ScribbleCanvas canvas, Point p) {
		// TODO Auto-generated method stub
		canvas.mouseButtonDown = true;
        xStart = canvas.x = p.x; 
        yStart = canvas.y = p.y; 
        onscreen = canvas.getGraphics();
        onscreen.setXORMode(Color.darkGray);
        onscreen.setColor(Color.lightGray); 
        shapes.get(shapeType).startDrawShape(onscreen, p, p);
	}

	public void mouseReleased(ScribbleCanvas canvas, Point p) {
		// TODO Auto-generated method stub
		canvas.mouseButtonDown = false;
		Point prevPoint = new Point(xStart, yStart);
		canvas.mouseButtonDown = false; 
        onscreen.setPaintMode();
        offscreen = canvas.getOffScreenGraphics();
        shapes.get(shapeType).endDrawShape(offscreen, prevPoint, p);
        canvas.repaint();
        
      //canvas.mouseButtonDown = false; 
        //onscreen.setPaintMode();
        //offscreen = canvas.getOffScreenGraphics(); 
        //offscreen.drawLine(xStart, yStart, p.x, p.y); 
        //canvas.repaint();
	}

	public void mouseDragged(ScribbleCanvas canvas, Point p) {
		// TODO Auto-generated method stub
		if (canvas.mouseButtonDown) {            
            Point prevPoint = new Point(xStart, yStart);
            shapes.get(shapeType).drawingShape(canvas, onscreen, prevPoint, p);
        }
        canvas.x = p.x; 
        canvas.y = p.y;
        /*
        if (canvas.mouseButtonDown) {
            onscreen.drawRect(xStart, yStart, canvas.x - xStart + 1, canvas.y - yStart + 1);  
            onscreen.drawRect(xStart, yStart, p.x - xStart + 1, p.y - yStart + 1); 
        }
        canvas.x = p.x; 
        canvas.y = p.y; 
        
        if (canvas.mouseButtonDown) {
            onscreen.drawOval(xStart, yStart, canvas.x - xStart + 1, canvas.y - yStart + 1); 
            onscreen.drawOval(xStart, yStart, p.x - xStart + 1, p.y - yStart + 1);  
        }
        canvas.x = p.x; 
        canvas.y = p.y;*/
	}
}
