package structure.bridge;

import util.Utils;

public class RefinedAbstraction extends BridgeAbstraction {

	public RefinedAbstraction(IfImplementer imple) {
		super(imple);
	}

	public void newExecute() {
		Utils.greet(this);
	}
}
