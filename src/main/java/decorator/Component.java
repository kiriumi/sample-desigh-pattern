package decorator;

import util.Utils;

public class Component implements IfComponent {

	@Override
	public void execute() {

		Utils.giveMyName(this);
	}

}
