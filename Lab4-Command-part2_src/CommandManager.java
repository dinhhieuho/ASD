
import java.util.Stack;

public class CommandManager {
	private Command command;
	private Command undo_cmd;
	Stack<Command> stack = new Stack<Command>();
	public void setCommand(Command command) {
		this.command = command;
		stack.push(this.command);
	}
	public void execute() {
		command.execute();
	}
	
	public void undo() {
		undo_cmd = stack.pop();
		undo_cmd.undo();
	}
	
	public void redo() {
		undo_cmd.redo();
		stack.push(undo_cmd);
	}
}
