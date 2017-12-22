package behavior.mediator;

import util.Utils;

public class Colleague extends AbstractColleague {

	public Colleague(String key) {
		super(key);
	}

	@Override
	public void needAdvice() {

		mediator.consultation(this);
	}

	@Override
	public void execute1() {
		Utils.whoDidIt();

	}

	@Override
	public void execute2() {
		Utils.whoDidIt();
	}

}
