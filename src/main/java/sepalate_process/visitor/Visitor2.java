package sepalate_process.visitor;

import util.Utils;

public class Visitor2 implements IfVisitable {

	@Override
	public void visit(Acceptor1 acceptor) {

		Utils.giveMyName(this);
	}

	@Override
	public void visit(Acceptor2 acceptor) {

		Utils.giveMyName(this);
	}
}
