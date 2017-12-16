package component_visitor;

public class ComponentVisitor2 implements IfComponentVisitable {

	public void visit(AcceptableComposite1 composite) {
		visit(composite);
	}

	public void visit(AcceptableLeaf1 leaf) {
		visit(leaf);
	}
}
