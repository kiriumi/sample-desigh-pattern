package create.abstruct_factory;

public class FactoryB extends AbstractFactory {

	@Override
	public AbstractProduct1 createProduct1() {

		return new ProductB1();
	}

	@Override
	public AbstractProduct2 createProduct2() {

		return new ProductB2();
	}

}
