package component_visitor;

public class AcceptableLeaf1 implements IfComponentAcceptable {

	@Override
	public void accept(IfComponentVisitable visitor) {
		visitor.visit(this);
	}

}
