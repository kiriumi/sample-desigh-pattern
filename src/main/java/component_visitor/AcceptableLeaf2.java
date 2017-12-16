package component_visitor;

public class AcceptableLeaf2 implements IfComponentAcceptable {

	@Override
	public void accept(IfComponentVisitable visitor) {
		visitor.visit(this);
	}

}
