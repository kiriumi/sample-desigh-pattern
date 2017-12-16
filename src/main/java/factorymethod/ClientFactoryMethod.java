package factorymethod;

public class ClientFactoryMethod {

	public static void main(String... args) {

		IfProduct product1 = new Product1Factory().create();
		product1.greet();

		IfProduct product2 = new Product2Factory().create();
		product2.greet();

	}

}
