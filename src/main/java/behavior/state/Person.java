package behavior.state;

public class Person {

	IfState state = null;

	public void setState(IfState state) {
		this.state = state;
	}

	public void greet() {
		state.execute();
	}
}
