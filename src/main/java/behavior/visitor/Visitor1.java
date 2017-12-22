package behavior.visitor;

import util.Utils;

public class Visitor1 implements IfVisitable {

	@Override
	public void visit(Acceptor1 acceptor) {

		System.out.print("Wow!, ");
		Utils.giveMyName(this);
	}

	@Override
	public void visit(Acceptor2 acceptor) {

		System.out.print("Nice to meet you!, ");
		Utils.giveMyName(this);
	}

}
