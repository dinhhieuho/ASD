
public class LogProxy implements Thing {
	Thing a;
	Functor func;
	public LogProxy(Thing a, Functor func) {
		this.a = a;
		this.func = func;
	}
	public void compute(String s) {
		// TODO Auto-generated method stub
		func.preMessage();
		a.compute(s);
		func.postMessage();
	}

}
