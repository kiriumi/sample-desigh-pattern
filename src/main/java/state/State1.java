package state;

import util.Utils;

public class State1 extends AbstractState {

	@Override
	public void execute() {
		Utils.greet(this.state);
	}

}
