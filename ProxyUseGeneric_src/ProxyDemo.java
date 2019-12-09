/*
 Hello: A
 Hello
 Hello: B
 Hello
 */
public class ProxyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thing<String> a = new aThing<String>("A");
		a.compute("Hello");
		ProxyFunctor proxyFunc = new ProxyFunctor();
		LogProxy<String> pThing = new LogProxy<String>(a, proxyFunc);
		pThing.compute("Hello");		
		
		Thing<String> b = new bThing<String>("B");
		b.compute("Hello");
	}

}
