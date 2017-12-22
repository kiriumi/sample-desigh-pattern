package combi.component_visitor;

public class ComponentVisitorClient {

	public static void main(String... args) {

		IfComponentAcceptable rootComponent = createRootComponent();

		IfComponentVisitable visitor = new ComponentVisitor();
		rootComponent.accept(visitor);
	}

	private static IfComponentAcceptable createRootComponent() {

		IfComponentAcceptable rootComponent = new AcceptableComposite("RootComponent");
		IfComponentAcceptable component1 = new AcceptableComposite("SubComponent");
		IfComponentAcceptable leaf1 = new AcceptableLeaf("Leaf1");
		IfComponentAcceptable leaf2 = new AcceptableLeaf("Leaf2");

		component1.add(leaf2);
		rootComponent.add(leaf1);
		rootComponent.add(component1);

		return rootComponent;

	}

}
