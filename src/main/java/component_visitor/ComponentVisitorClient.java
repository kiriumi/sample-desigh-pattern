package component_visitor;

public class ComponentVisitorClient {

	public static void main(String... args) {

		IfComponentAcceptable component0 = createComponent0();

		IfComponentVisitable visitor1 = new ComponentVisitor1();
		component0.accept(visitor1);

		IfComponentVisitable visitor2 = new ComponentVisitor2();
		component0.accept(visitor2);
	}

	private static  IfComponentAcceptable  createComponent0() {

		IfComponentAcceptable component0 = new AcceptableComposite0();
		IfComponentAcceptable component1 = new AcceptableComposite1();
		IfComponentAcceptable leaf1 = new AcceptableLeaf1();
		IfComponentAcceptable leaf2 = new AcceptableLeaf2();

		component1.add(leaf2);
		component0.add(leaf1);
		component0.add(component1);

		return component0;


	}

}
