package sepalate_process.strategy;

import util.Utils;

public class Strategy2 implements IfStrategy {

	@Override
	public void execute() {
		Utils.greet(this);
	}

}
