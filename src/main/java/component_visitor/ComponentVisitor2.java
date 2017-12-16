package component_visitor;

public class ComponentVisitor2 implements IfComponentVisitable {

	public void visit(AcceptableComposite0 composite0) {
		visit(composite0);
	}

	public void visit(AcceptableComposite1 composite1) {
		visit(composite1);
	}

	public void visit(AcceptableLeaf1 leaf1) {
		visit(leaf1);
	}

	public void visit(AcceptableLeaf2 leaf2) {
		visit(leaf2);
	}
}
