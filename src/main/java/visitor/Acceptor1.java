package visitor;

import util.Utils;

public class Acceptor1 implements IfAcceptable {

	@Override
	public void accept(IfVisitable visitor) {

		System.out.print("Oh!, ");

		Utils.giveMyName(this);
		Utils.welcome(visitor);

		visitor.visit(this);
	}

}
