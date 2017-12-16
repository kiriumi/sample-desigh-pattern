package visitor;

import util.Utils;

public class Visitor1 implements IfVisitable {

	public void visit(Acceptor1 acceptor) {

		System.out.print("I'm " + Utils.getSimpleClassName(this) + ", ");
		System.out.println("Hello " + Utils.getSimpleClassName(acceptor));
	}

	public void visit(Acceptor2 acceptor) {

		System.out.print("I'm " + Utils.getSimpleClassName(acceptor) + ", ");
		System.out.println("Hello " + Utils.getSimpleClassName(this));
	}

}
