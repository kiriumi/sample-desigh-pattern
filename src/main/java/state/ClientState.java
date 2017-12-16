package state;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ClientState {

	public static void main(String... args) {

		int[] keys = { 1, 2, 3, 4 };
		IntStream keysStream = Arrays.stream(keys);

		AbstractState state1 = new State1();
		AbstractState state2 = new State2();

		AbstractState state = new State1();

		keysStream.forEach(key -> {

			System.out.print("key=" + key + ": ");

			if ((key % 2) == 1) {
				state.setState(state1);

			} else {
				state.setState(state2);

			}

			state.execute();
		});

	}

}
