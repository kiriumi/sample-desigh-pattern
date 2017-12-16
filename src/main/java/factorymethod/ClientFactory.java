package factorymethod;

public class ClientFactory {

	public static void main(String... args) {

		IfProduct product = Factory.create(1);
		product.greet();

		product = Factory.create(2);
		product.greet();

	}

}
