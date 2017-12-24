package make_object.factory;

import make_object.factorymethod.IfProduct;
import make_object.factorymethod.Product1;
import make_object.factorymethod.Product2;

/**
 * 生成するオブジェクトの種類を動的に行う
 *
 * @author Kengo
 *
 */
public final class Factory {

	public static IfProduct create() {

		return new Product1();
	}

	public static IfProduct create(int i) {

		return (i == 1) ? new Product1() : new Product2();
	}
}
