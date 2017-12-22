package structure.proxy;

import util.Utils;

public class Proxy implements IfSubject {

	IfSubject subject = new Subject();

	@Override
	public void methodA() {

		Utils.giveMyName(this);
	}

	@Override
	public void methodB() {

		subject.methodB();
	}

}
