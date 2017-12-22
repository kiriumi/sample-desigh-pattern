package structure.decorator;

import util.Utils;

public class Decorator1 implements IfComponent {

	IfComponent component;

	public Decorator1(IfComponent component) {
		this.component = component;
	}

	@Override
	public void execute() {

		component.execute();
		Utils.giveMyName(this);
	}

}
