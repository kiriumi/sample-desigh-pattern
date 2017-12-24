package structure.interpreter;

import java.util.Deque;

public class TerminalExpression implements IfExpression {

	int number;

	TerminalExpression(int number) {

		this.number = number;
	}

	@Override
	public void interpret(Deque<Integer> deque) {

		deque.push(number);
	}

}
