package make_object.prototype;

import util.Utils;

public class Prototype implements IfPrototype {

	private final String name;

	public Prototype(String name) {
		this.name = name;
	}

	@Override
	public IfPrototype createClone() throws CloneNotSupportedException {
		return (IfPrototype) clone();
	}

	@Override
	public void execute1() {
		Utils.giveMyName(name);

	}

	@Override
	public void execute2(int i) {
		Utils.greet(String.valueOf(i));
	}

}
