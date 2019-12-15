import java.util.HashMap;
import java.util.Map;

/*
 * Concrete Mediator
 * */
public class ChatRoom implements IChatRoom {

	private Map<String, User> usersMap =  new HashMap<String, User>();
	
	public void sendMessage(String msg, String userId) {
		// TODO Auto-generated method stub
		User u = usersMap.get(userId);
		u.receive(msg);
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		usersMap.put(user.getId(), user);
	}

}
