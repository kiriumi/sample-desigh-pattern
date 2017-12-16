package component_visitor;

import util.Utils;

public class ComponentVisitor implements IfComponentVisitable {

	@Override
	public void visit(AcceptableComposite composite) {
		Utils.greet(composite.getName());
	}

	@Override
	public void visit(AcceptableLeaf leaf) {
		Utils.greet(leaf.getName());
	}
}
