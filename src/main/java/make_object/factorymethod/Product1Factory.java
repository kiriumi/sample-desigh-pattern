package make_object.factorymethod;

public class Product1Factory implements IfFproductFactory {

	public static IfProduct create() {
		return new Product1();
	}

}
