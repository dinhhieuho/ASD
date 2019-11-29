import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class EraseTool implements Tool {

	protected Graphics offscreen;
	public void mousePressed(ScribbleCanvas canvas, Point p) {
		// TODO Auto-generated method stub
		canvas.mouseButtonDown = true;
        canvas.x = p.x; 
        canvas.y = p.y;        
        offscreen = canvas.getOffScreenGraphics(); 
        offscreen.setColor(Color.white); 
	}

	public void mouseReleased(ScribbleCanvas canvas, Point p) {
		// TODO Auto-generated method stub
		canvas.mouseButtonDown = false; 
        canvas.setPenColor(canvas.penColor);
	}

	public void mouseDragged(ScribbleCanvas canvas, Point p) {
		// TODO Auto-generated method stub
		if (canvas.mouseButtonDown) {
            int xs, ys, dx, dy; 
            xs = Math.min(canvas.x, p.x) - 2;
            ys = Math.min(canvas.y, p.y) - 2;
            dx = Math.abs(p.x - canvas.x) +  6;
            dy = Math.abs(p.y - canvas.y) +  6;
            offscreen.fillRect(xs, ys, dx, dy); 
            canvas.repaint(xs, ys, dx, dy); 
            canvas.x = p.x; 
            canvas.y = p.y; 
        }
	}

	public void setShapeType(int type) {
		// TODO Auto-generated method stub
		
	}

}
