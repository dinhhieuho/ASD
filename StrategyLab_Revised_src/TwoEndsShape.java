import java.awt.Graphics;
import java.awt.Point;

public interface TwoEndsShape {
	public void startDrawShape(Graphics onscreen, Point p1, Point p2);
	public void drawingShape(ScribbleCanvas canvas, Graphics onscreen, Point p1, Point p2);
	public void endDrawShape(Graphics offscreen, Point p1, Point p2);
	//public void drawOutline(ScribbleCanvas canvas, Point p1, Point p2);
}
