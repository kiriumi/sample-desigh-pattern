package strategy;

import java.util.stream.Stream;

public class ClientStrategy {

	public static void main(String[] args) {

		IfStrategy[] stategys = { new Strategy1(), new Strategy2() };
		Stream<IfStrategy> stream = Stream.of(stategys);

		stream.forEach(stategy -> stategy.execute());
	}

}
