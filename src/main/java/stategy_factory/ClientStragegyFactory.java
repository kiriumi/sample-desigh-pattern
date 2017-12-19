package stategy_factory;

import java.util.stream.Stream;

public class ClientStragegyFactory {

	public static void main(String... args) {

		Stream<Battle> stream = Stream.of(
				new Battle("Battle1", new Strategy1Factory()),
				new Battle("Battle2", new Strategy2Factory()),
				new Battle("Battle3", new Strategy1Factory()));

		stream.forEach(battle -> battle.executeStragety());
	}

}
