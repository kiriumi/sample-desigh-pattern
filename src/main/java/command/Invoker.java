package command;

import java.util.ArrayDeque;
import java.util.Deque;

public class Invoker {

	private Deque<IfCommand> commands = new ArrayDeque<IfCommand>();

	public void add(IfCommand command) {
		commands.add(command);
	}

	public void push(IfCommand command) {
		commands.push(command);
	}

	public void pop() {
		commands.pop();
	}

	public void remove(IfCommand command) {
		commands.remove(command);
	}

	public void execute() {
		commands.poll().execute();
	}

	public void executeAll() {

		commands.forEach(command -> {
			commands.poll().execute();
		});

	}

}
