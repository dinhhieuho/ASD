import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CommandManager {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	public void execute() {
		command.execute();
	}
	
	public void undo() {
		command.undo();
	}
	
	public void redo() {
		command.redo();
	}
}
