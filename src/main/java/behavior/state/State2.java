package behavior.state;

import util.Utils;

public class State2 implements IfState {

	@Override
	public void execute() {
		Utils.greet(this);
	}

}
