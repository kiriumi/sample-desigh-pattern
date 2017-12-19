package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private static FlyweightFactory instance = new FlyweightFactory();

	private Map<String, Flyweight> flyweightMap = new HashMap<String, Flyweight>();

	private FlyweightFactory() {

	}

	public static FlyweightFactory getInstance() {
		return instance;
	}

	public Flyweight getFlyweight(String name) {

		if (!flyweightMap.containsKey(name)) {

			Flyweight newFlyweight = new Flyweight(name);
			flyweightMap.put(name, newFlyweight);
		}

		return flyweightMap.get(name);
	}

}
