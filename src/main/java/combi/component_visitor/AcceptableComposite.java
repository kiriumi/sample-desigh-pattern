package combi.component_visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AcceptableComposite implements IfComponentAcceptable {

	private List<IfComponentAcceptable> components = new ArrayList<IfComponentAcceptable>();

	private final String name;

	public AcceptableComposite(String name) {
		this.name = name;
	}

	@Override
	public void add(IfComponentAcceptable component) {
		components.add(component);
	}

	@Override
	public void accept(IfComponentVisitable visitor) {

		visitor.visit(this);

		Stream<IfComponentAcceptable> stream = components.stream();
		stream.forEach(component -> component.accept(visitor));
	}

	public String getName() {
		return name;
	}

}
