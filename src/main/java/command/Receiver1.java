package command;

import util.Utils;

public class Receiver1 implements IfReceiver {

	@Override
	public void actionA() {
		Utils.whoDidIt();
	}

	@Override
	public void actionB() {
		Utils.whoDidIt();
	}

}
