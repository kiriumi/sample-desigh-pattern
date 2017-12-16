package composite;

import util.Utils;

public abstract class AbstractLeaf implements IfComponent {

	@Override
	public void execute() {

		Utils.greet(this);
	}

}
