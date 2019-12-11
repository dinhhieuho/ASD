
public class LogProxy<T> implements Thing<T> {
	Thing<T> a;
	Functor func;
	public LogProxy(Thing<T> a, Functor func) {
		this.a = a;
		this.func = func;
	}
	
	@Override
	public void compute(T t) {
		// TODO Auto-generated method stub
		func.preMessage();
		a.compute(t);
		func.postMessage();
	}

}
