package visitor;

import util.Utils;

public class Acceptor2 implements IfAcceptable {

	@Override
	public void accept(IfVisitable visitor) {

		Utils.giveMyName(this);
		Utils.welcome(visitor);

		visitor.visit(this);
	}

}
