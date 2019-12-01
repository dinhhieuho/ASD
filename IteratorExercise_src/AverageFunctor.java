
public class AverageFunctor<T extends Number,R extends Number> implements Functor<T,R> {

	Double sum = Double.valueOf(0.0);
	Double count = Double.valueOf(0);
	public R compute(T element) {
		// TODO Auto-generated method stub
		sum += element.doubleValue();
		count++;
		return (R) sum;
	}

	public R getValue() {
		// TODO Auto-generated method stub
		return (R) ((Double)(sum/count));
	}

}
