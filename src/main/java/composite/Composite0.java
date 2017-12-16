package composite;

public class Composite0 extends AbustractComposite {

	public Composite0() {

		add(new Composite1());
		add(new Leaf1());
	}
}
