import java.awt.Graphics;
import java.awt.Point;

public class OvalShape implements TwoEndsShape {

	public void startDrawShape(Graphics onscreen, Point p1, Point p2) {
		onscreen.drawOval(p1.x, p1.y, 1, 1); 
	}
	public void drawingShape(ScribbleCanvas canvas, Graphics onscreen, Point p1, Point p2) {
		onscreen.drawOval(p1.x, p1.y, canvas.x - p1.x + 1, canvas.y - p1.y + 1); 
		onscreen.drawOval(p1.x, p1.y, p2.x - p1.x + 1, p2.y - p1.y + 1);
	}
	public void endDrawShape(Graphics offscreen, Point p1, Point p2) {
		offscreen.drawOval(p1.x, p1.y, p2.x-p1.x+1, p2.y-p1.y+1);
	}
}
