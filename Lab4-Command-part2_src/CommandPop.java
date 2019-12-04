
public class CommandPop implements Command {
	VStack stack;
	String lastEl;
	public CommandPop(VStack stack) {
		this.stack = stack;
	}
	public void execute() {
		// TODO Auto-generated method stub
		lastEl = (String)stack.pop();
	}
	public void undo() {
		stack.push(lastEl);
	}
	public void redo() {
		execute();
	}
}