package component_visitor;

import util.Utils;

public interface IfComponentVisitable {

	public default void visit(IfComponentAcceptable component) {

		System.out.print("I'm " + Utils.getSimpleClassName(this) + ", ");
		System.out.println("Hello " + Utils.getSimpleClassName(component));
	}
}
