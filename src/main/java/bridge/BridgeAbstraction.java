package bridge;

public class BridgeAbstraction {

	private IfImplementer imple;

	public BridgeAbstraction(IfImplementer imple) {
		this.imple = imple;
	}

	public void execute() {
		imple.execute();
	}

}
