package structure.interpreter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Parser {

	private List<IfExpression> expressions = new ArrayList<IfExpression>();

	public Parser(String expression) {

		for (String token : expression.split(" ")) {

			if (token.equals("+")) {
				expressions.add(new NonTerminalExpressionPlus());

			} else if (token.equals("-")) {
				expressions.add(new NonTerminalExpressionMinus());

			} else {
				expressions.add(new TerminalExpression(Integer.parseInt(token)));

			}
		}
	}

	public Integer evaluate() {

		Deque<Integer> deque = new ArrayDeque<Integer>();
		expressions.forEach(exp -> exp.interpret(deque));
		return deque.pop();
	}
}
