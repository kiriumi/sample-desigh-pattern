package mediator;

public abstract class AbstractColleague {

	private final String key;

	protected AbstractMediator mediator;

	public AbstractColleague(String key) {
		this.key = key;
	}

	public void setMediator(AbstractMediator mediator) {
		this.mediator = mediator;
	};

	public String getKey() {
		return key;
	}

	public abstract void needAdvice();

	public abstract void execute1();

	public abstract void execute2();

}
