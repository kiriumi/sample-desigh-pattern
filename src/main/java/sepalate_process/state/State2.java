package sepalate_process.state;

import util.Utils;

public class State2 implements IfState {

	@Override
	public void execute() {
		Utils.greet(this);
	}

}
