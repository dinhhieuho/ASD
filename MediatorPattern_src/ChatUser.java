/*
 * Concrete Colleagues
 * */
public class ChatUser extends User {

	public ChatUser(IChatRoom room, String id, String name) {
		super(room, id, name);
	}
	
	@Override
	public void send(String msg, String userId) {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + " :: Sending Message : " + msg);
        getMediator().sendMessage(msg, userId);
	}

	@Override
	public void receive(String msg) {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + " :: Received Message : " + msg);
	}

}
