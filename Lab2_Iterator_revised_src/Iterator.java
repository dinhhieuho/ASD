
public interface Iterator {
	public Object First();
	public Object End();
	public Object Next();
	public Object Previous();
	public boolean hasNext();
	public boolean hasPrevious();
	public Object CurrentItem();
}
