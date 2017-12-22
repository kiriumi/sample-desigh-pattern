package create.abstruct_factory;

import util.Utils;

public class ProductB1 extends AbstractProduct1 {

	@Override
	public void execute() {

		Utils.greet(this);
	}

}
