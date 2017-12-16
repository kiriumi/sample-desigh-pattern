package state;

public abstract class AbstractState {

	protected AbstractState state;

	public void setState(AbstractState state) {
		this.state = state;
	};

	public abstract void execute();
}
