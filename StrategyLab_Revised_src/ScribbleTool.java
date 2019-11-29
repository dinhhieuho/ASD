import java.awt.Point;

public class ScribbleTool implements Tool {
	public void mousePressed(ScribbleCanvas canvas, Point p) {
		// TODO Auto-generated method stub
		canvas.mouseButtonDown = true;
        canvas.x = p.x; 
        canvas.y = p.y;
	}

	public void mouseReleased(ScribbleCanvas canvas, Point p) {
		// TODO Auto-generated method stub
		canvas.mouseButtonDown = false;
	}

	public void mouseDragged(ScribbleCanvas canvas, Point p) {
		// TODO Auto-generated method stub
		if (canvas.mouseButtonDown) {
            canvas.getOffScreenGraphics().drawLine(canvas.x, canvas.y, p.x, p.y); 
            int xs = Math.min(canvas.x, p.x); 
            int ys = Math.min(canvas.y, p.y); 
            int dx = Math.abs(p.x-canvas.x) +1;
            int dy = Math.abs(p.y-canvas.y) +1; 
            canvas.repaint(xs, ys, dx, dy); 
            canvas.x = p.x; 
            canvas.y = p.y; 
        }
	}

	public void setShapeType(int type) {
		// TODO Auto-generated method stub
		
	}
}
