import java.util.Iterator;
import java.util.Vector;
import java.util.function.Predicate;

public class MyVector<T> extends Vector {
	
	public<R> R doAll(Functor<T,R> proFunc){
		Iterator<T> it = this.iterator();
		while(it.hasNext()) {
			T t = it.next();
			proFunc.compute(t);
		}
		return proFunc.getValue();
	}
	public<R> R doAll(Predicate<T> pred, Functor<T,R> proFunc){
		Iterator<T> it = this.iterator();
		while(it.hasNext()) {
			T t = it.next();
			if(pred.test(t))
				proFunc.compute(t);
		}
		return proFunc.getValue();
	}
}
