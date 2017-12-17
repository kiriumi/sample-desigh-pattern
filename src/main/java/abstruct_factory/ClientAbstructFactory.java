package abstruct_factory;

import java.util.stream.Stream;

public class ClientAbstructFactory {

	public static void main(String... args) {

		Stream<AbstractFactory> stream = Stream.of(
				new FactoryA(),
				new FactoryB());

		stream.forEach(factory -> {
			AbstractProduct1 product1 = factory.createProduct1();
			product1.execute();

			AbstractProduct2 product2 = factory.createProduct2();
			product2.run();
		});
	}
}
