package reduce_load.flyweight;

import util.Utils;

public class ClientFlyweight {

	public static void main(String[] args) {

		FlyweightFactory factory = FlyweightFactory.getInstance();

		Flyweight flyweight1 = factory.getFlyweight("Hoge");
		Utils.greet(flyweight1.getName());

		Flyweight flyweight2 = factory.getFlyweight("Foo");
		Utils.greet(flyweight2.getName());

		if (flyweight1 == factory.getFlyweight("Hoge")) {
			Utils.greet(flyweight1.getName());
		}
	}
}
