package bridge;

import util.Utils;

public class Imple1 implements IfImplementer {

	@Override
	public void execute() {

		Utils.giveMyName(this);
	}

}
