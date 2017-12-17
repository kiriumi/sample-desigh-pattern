package factory;

import factorymethod.IfProduct;
import factorymethod.Product1;
import factorymethod.Product2;

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

		if (i == 1) {
			return new Product1();
		} else {
			return new Product2();
		}
	}
}
