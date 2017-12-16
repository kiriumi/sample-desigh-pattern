package component_visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AcceptableComposite1 implements IfComponentAcceptable {

	List<IfComponentAcceptable> components = new ArrayList<IfComponentAcceptable>();

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

}
