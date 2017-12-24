package sepalate_process.visitor;

import util.Utils;

public class ClientVisitor {

	public static void main(String... args) {

		IfVisitable visitor1 = new Visitor1();
		IfVisitable visitor2 = new Visitor2();

		IfAcceptable acceptor1 = new Acceptor1();
		IfAcceptable acceptor2 = new Acceptor2();

		acceptor1.accept(visitor1);
		Utils.printNewLine();

		acceptor1.accept(visitor2);
		Utils.printNewLine();

		acceptor2.accept(visitor1);
		Utils.printNewLine();

		acceptor2.accept(visitor2);
	}
}
