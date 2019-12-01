import java.util.function.Predicate;

public class BiggerThan2<T extends Number> implements Predicate<T> {

	@Override
	public boolean test(T arg0) {
		// TODO Auto-generated method stub
		return arg0.doubleValue() > 2;
	}

}
