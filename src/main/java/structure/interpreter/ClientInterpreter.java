package structure.interpreter;

public class ClientInterpreter {

	public static void main(String[] args) {

		String expression = "42 4 2 - +";
		Parser parser = new Parser(expression);
		System.out.println(parser.evaluate());
	}
}
