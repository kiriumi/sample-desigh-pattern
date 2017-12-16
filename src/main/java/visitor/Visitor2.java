package visitor;

import util.Utils;

public class Visitor2 implements IfVisitable {

	@Override
	public void visit(Acceptor1 acceptor) {

		Utils.giveMyName(this);
		Utils.greet(acceptor);

		Utils.printNewLine();
	}

	@Override
	public void visit(Acceptor2 acceptor) {

		Utils.giveMyName(this);
		Utils.greet(acceptor);

		Utils.printNewLine();
	}
}
