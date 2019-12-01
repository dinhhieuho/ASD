
public interface Functor<T, R> {
	public R compute(T element);
	public R getValue();
}
