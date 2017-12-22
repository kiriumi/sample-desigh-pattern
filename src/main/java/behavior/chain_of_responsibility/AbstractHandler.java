package behavior.chain_of_responsibility;

public abstract class AbstractHandler {

	protected int level;

	private AbstractHandler next;

	public AbstractHandler setNext(AbstractHandler next) {
		this.next = next;
		return next;
	}

	public abstract void request(Question question);

	protected AbstractHandler getNext() {
		return next;
	}

}
