
public class bThing<T> implements Thing<T> {

	public bThing(String name) {
		System.out.println("Hello: "+name);
	}
	public void compute(T s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}

}
