package create.abstruct_factory;

public class FactoryA extends AbstractFactory {

	@Override
	public AbstractProduct1 createProduct1() {

		return new ProductA1();
	}

	@Override
	public AbstractProduct2 createProduct2() {

		return new ProductA2();
	}

}
