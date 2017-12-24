package make_object.abstruct_factory;

import util.Utils;

public class ProductA1 extends AbstractProduct1 {

	@Override
	public void execute() {

		Utils.greet(this);
	}

}
