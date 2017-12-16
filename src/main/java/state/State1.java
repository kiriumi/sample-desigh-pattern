package state;

import util.Utils;

public class State1 implements IfState {

	@Override
	public void execute() {
		Utils.greet(this);
	}

}
