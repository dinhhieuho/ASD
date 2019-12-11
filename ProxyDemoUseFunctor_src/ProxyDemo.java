/*
 Hello: A
 Hello
 Hello: B
 Hello
 */
public class ProxyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thing a = new aThing("A");
		a.compute("Hello");
		ProxyFunctor proxyFunc = new ProxyFunctor();
		LogProxy proxy = new LogProxy(a, proxyFunc);
		proxy.compute("Hello");		
		
		Thing b = new bThing("B");
		b.compute("Hello");
	}

}
