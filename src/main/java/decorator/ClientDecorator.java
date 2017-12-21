package decorator;

import util.Utils;

public class ClientDecorator {

	public static void main(String[] args) {

		IfComponent component = new Component();
		component.execute();

		Utils.printNewLine();

		IfComponent decorator1 = new Decorator1(component);
		decorator1.execute();

		Utils.printNewLine();

		IfComponent decorator2 = new Decorator2(decorator1);
		decorator2.execute();

	}
}
