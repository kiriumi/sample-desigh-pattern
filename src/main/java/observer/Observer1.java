package observer;

import util.Utils;

public class Observer1 implements IfObserver {

	@Override
	public void update(AbstractSubject subject) {

		Utils.greet(subject);
		Utils.giveMyName(this);
	}

}
