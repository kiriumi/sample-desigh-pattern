package extend_class.bridge;

import util.Utils;

public class Imple2 implements IfImplementer {

	@Override
	public void execute() {

		Utils.giveMyName(this);
	}

}
