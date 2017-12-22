package behavior.command;

public interface IfCommand {

	public void setReceiver(IfReceiver receiver);

	public void execute();

}
