package structure.interpreter;

import java.util.Deque;

public class NonTerminalExpressionMinus implements IfExpression {

	@Override
	public void interpret(Deque<Integer> deque) {

		deque.push(-deque.pop() + deque.pop());
	}

}
