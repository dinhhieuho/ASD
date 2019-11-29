import java.awt.Graphics;
import java.awt.Point;

public class LineShape implements TwoEndsShape {
	
	public void startDrawShape(Graphics onscreen, Point p1, Point p2) {
		onscreen.drawLine(p1.x, p1.y, p2.x, p2.y);
	}
	public void drawingShape(ScribbleCanvas canvas, Graphics onscreen, Point p1, Point p2) {
		onscreen.drawLine(p1.x, p1.y, canvas.x, canvas.y); 
		onscreen.drawLine(p1.x, p1.y, p2.x, p2.y);
	}
	public void endDrawShape(Graphics offscreen, Point p1, Point p2) {
		offscreen.drawLine(p1.x, p1.y, p2.x, p2.y); 
	}
}
