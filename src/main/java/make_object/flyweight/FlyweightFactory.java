package make_object.flyweight;

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

		flyweightMap.putIfAbsent(name, new Flyweight(name));

		return flyweightMap.get(name);
	}

}
