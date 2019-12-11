import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicInvocationHandler implements InvocationHandler {

	private Object obj;
	private DynamicInvocationHandler(Object obj) {
		this.obj = obj;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object ret;
		long t1 = System.currentTimeMillis();
		ret = method.invoke(obj, args);
		long t2 = System.currentTimeMillis();
		//if(t2-t1>10) {
			System.out.println("It takes "+(t2-t1)+" millis to invoke "
					+ method.getName()+"() with");
			for(int i=0;i<args.length;i++) {
				System.out.println("   arg["+i+"]: "+args[i]);
			}
		//}
        return ret;
	}
	
	public static Object newInstance(Object obj) {
	    ClassLoader loader = obj.getClass().getClassLoader();
	    Class[] classes = obj.getClass().getInterfaces();
	    return Proxy.newProxyInstance(
	        loader, classes, new DynamicInvocationHandler(obj));
	}

}
