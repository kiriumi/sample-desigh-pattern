package behavior.visitor;

import util.Utils;

public class Acceptor2 implements IfAcceptable {

	@Override
	public void accept(IfVisitable visitor) {

		Utils.giveMyName(this);

		visitor.visit(this);
	}

}
