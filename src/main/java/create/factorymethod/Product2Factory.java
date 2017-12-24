package create.factorymethod;

public class Product2Factory implements IfFproductFactory {

	public static IfProduct create() {
		return new Product2();
	}

}
