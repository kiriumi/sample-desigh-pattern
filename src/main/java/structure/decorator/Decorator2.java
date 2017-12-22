package structure.decorator;

import util.Utils;

public class Decorator2 implements IfComponent {

	IfComponent component;

	public Decorator2(IfComponent component) {
		this.component = component;
	}

	@Override
	public void execute() {

		component.execute();
		Utils.giveMyName(this);
	}

}
