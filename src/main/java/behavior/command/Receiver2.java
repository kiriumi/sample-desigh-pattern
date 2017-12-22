package behavior.command;

import util.Utils;

public class Receiver2 implements IfReceiver {

	@Override
	public void actionA() {
		Utils.whoDidIt();
	}

	@Override
	public void actionB() {
		Utils.whoDidIt();
	}

}
