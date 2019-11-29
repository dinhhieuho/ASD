import java.awt.Point;

public interface Tool {
	public void mousePressed(ScribbleCanvas canvas, Point p);
	public void mouseReleased(ScribbleCanvas canvas, Point p);
	public void mouseDragged(ScribbleCanvas canvas, Point p);
	public void setShapeType(int type);
}
