package component_visitor;

public interface IfComponentAcceptable {

	default public void add(IfComponentAcceptable component) {

	}

	public void accept(IfComponentVisitable visitor);
}
