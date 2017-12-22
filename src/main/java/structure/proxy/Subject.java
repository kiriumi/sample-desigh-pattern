package structure.proxy;

import util.Utils;

public class Subject implements IfSubject {

	@Override
	public void methodA() {

		Utils.giveMyName(this);
	}

	@Override
	public void methodB() {

		Utils.giveMyName(this);
	}

}
