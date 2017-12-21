package mediator;

public class Colleague extends AbstractColleague {

	public Colleague(String key) {
		super(key);
	}

	@Override
	public void needAdvice() {

		mediator.consultation(this);
	}

	@Override
	public void execute1() {
		System.out.println("execute1");

	}

	@Override
	public void execute2() {

		System.out.println("execute2");
	}

}
