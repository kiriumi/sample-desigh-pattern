package factorymethod;

import util.Utils;

public class Product1 implements IfProduct {

	@Override
	public void greet() {
		Utils.greet(this);
	}

}
