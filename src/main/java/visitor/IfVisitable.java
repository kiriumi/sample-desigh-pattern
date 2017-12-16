package visitor;

import util.Utils;

/**
 * Visitorのインターフェース
 * @author Kengo
 *
 */
public interface IfVisitable {

	public default void visit(IfAcceptable acceptor) {

		System.out.print("I'm " + Utils.getSimpleClassName(this) + ", ");
		System.out.println("Hello " + Utils.getSimpleClassName(acceptor));
	}
}
