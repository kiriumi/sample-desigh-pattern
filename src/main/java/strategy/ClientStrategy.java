package strategy;

import java.util.stream.Stream;

public class ClientStrategy {

	public static void main(String[] args) {

		//		int[] keys = { 1, 2, 3 };
		//		IntStream keysStream = Arrays.stream(keys);
		//
		//		keysStream.forEach(key -> {
		//
		//			System.out.print("key=" + key + ": ");
		//
		//			IfStrategy strategy = null;
		//			strategy = (key == 1)
		//					? new Strategy1()
		//					: new Strategy2();
		//
		//			strategy.execute();
		//		});

		IfStrategy[] stategys = { new Strategy1(), new Strategy2() };
		Stream<IfStrategy> stream = Stream.of(stategys);

		stream.forEach(stategy -> stategy.execute());

	}

}
