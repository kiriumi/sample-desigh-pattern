package stategy_factory;

import java.util.stream.Stream;

public class ClientStragegyFactory {

	public static void main(String... args) {

		Stream<Battle> stream = Stream.of(
				new Battle("ミッドウェー", new Strategy1Factory()),
				new Battle("レイテ沖", new Strategy2Factory()));

		stream.forEach(battle -> battle.doStragety());

	}
}
