package visitor;

import util.Utils;

/**
 * Acceptインターフェース
 * @author Kengo
 *
 */
public interface IfAcceptable {

	default public void accept(IfVisitable visitor) {

		System.out.print("I'm " + Utils.getSimpleClassName(this) + ", ");
		System.out.println("Welcome " + Utils.getSimpleClassName(visitor));

		visitor.visit(this);
	}
}
