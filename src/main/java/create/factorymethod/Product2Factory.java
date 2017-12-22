package create.factorymethod;

public class Product2Factory implements IfFactory {

	@Override
	public IfProduct create() {
		return new Product2();
	}

}
