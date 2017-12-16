package state;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ClientState {

	public static void main(String... args) {

		Person person = new Person();
		IfState state1 = new State1();
		IfState state2 = new State2();

		int[] keys = { 1, 2, 3, 4 };
		IntStream keysStream = Arrays.stream(keys);

		keysStream.forEach(key -> {

			System.out.print("key=" + key + ": ");

			if ((key % 2) == 1) {
				person.setState(state1);

			} else {
				person.setState(state2);

			}

			person.greet();
		});

	}

}
