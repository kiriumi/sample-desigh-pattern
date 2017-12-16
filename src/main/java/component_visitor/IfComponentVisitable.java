package component_visitor;

public interface IfComponentVisitable {

	public void visit(AcceptableComposite composite);

	public void visit(AcceptableLeaf leaf);

}
