import java.util.HashSet;
import java.util.Set;

public class DynamicProxyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new HashSet<>();
		s = (Set) DynamicInvocationHandler.newInstance(s);
		s.add(new Object());
		s.add(new BadApple("Lemon")); 
	}	
}
