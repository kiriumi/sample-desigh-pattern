package composite;

import util.Utils;

public abstract class AbstractLeaf implements IfComponent {

	@Override
	public void execute() {

		System.out.println("Hello " + Utils.getSimpleClassName(this));
	}

}
