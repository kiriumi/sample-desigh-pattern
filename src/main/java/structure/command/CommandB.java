package structure.command;

public class CommandB implements IfCommand {

	private IfReceiver receiver;

	@Override
	public void setReceiver(IfReceiver receiver) {
		this.receiver = receiver;

	}

	@Override
	public void execute() {
		receiver.actionB();

	}

}
