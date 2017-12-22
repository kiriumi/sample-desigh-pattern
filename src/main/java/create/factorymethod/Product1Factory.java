package create.factorymethod;

public class Product1Factory implements IfFactory {

	@Override
	public IfProduct create() {
		return new Product1();
	}

}
