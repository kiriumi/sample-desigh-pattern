package make_object.factorymethod;

import util.Utils;

public class Product2 implements IfProduct {

	@Override
	public void greet() {
		Utils.greet(this);
	}

}
