package create.factorymethod;

public class ClientFactoryMethod {

	public static void main(String... args) {

		IfProduct product1 = Product1Factory.create();
		product1.greet();

		IfProduct product2 = Product2Factory.create();
		product2.greet();

		IfProduct productNull = IfFproductFactory.create();
		productNull.greet();
	}

}
