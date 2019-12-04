
public class CommandPush implements Command {

	String input = "";
	VStack stack;
	public CommandPush(VStack stack, String input){
		this.stack = stack;	
		this.input = input;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		if (!input.equals(""))
			stack.push(input);
	}
	
	public void undo() {
		stack.pop();
	}
	
	public void redo() {
		execute();
	}
	
}
