package stategy_factory;

import strategy.IfStrategy;

public class ClientStragegyFactory {

	public static void main(String... args) {

		IfStrategy strategy = new Strategy1Factory().create();
		strategy.execute();
	}
}
