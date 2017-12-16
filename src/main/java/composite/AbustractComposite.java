package composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import util.Utils;

public abstract class  AbustractComposite implements IfComponent {

	private List<IfComponent> components = new ArrayList<IfComponent>();

	@Override
	public void add(IfComponent component) {
		components.add(component);
	}

	@Override
	public void execute() {

		System.out.println("Hello " + Utils.getSimpleClassName(this));

		Stream<IfComponent> stream = components.stream();
		stream.forEach(component -> component.execute());
	}

}
