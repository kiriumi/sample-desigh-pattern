package make_object.factorymethod;

import util.Utils;

public class ProductNull implements IfProduct {

	@Override
	public void greet() {
		Utils.giveMyName(this);
	}

}
