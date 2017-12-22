package combi.component_visitor;

public class AcceptableLeaf implements IfComponentAcceptable {

	private final String name;

	public AcceptableLeaf(String name) {
		this.name = name;
	}

	@Override
	public void accept(IfComponentVisitable visitor) {
		visitor.visit(this);
	}

	public String getName() {
		return name;
	}

}
