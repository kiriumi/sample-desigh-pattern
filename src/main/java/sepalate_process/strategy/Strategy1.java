package sepalate_process.strategy;

import util.Utils;

public class Strategy1 implements IfStrategy {

	@Override
	public void execute() {
		Utils.greet(this);
	}

}
