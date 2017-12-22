package behavior.observer;

public interface IfObserver {

	public void update(AbstractSubject subject);

	/** 余興（相互委譲：Subject → [Observer] → Subject） */
	public default void dispatch(AbstractSubject subject) {
		subject.dispatched();
	};

}
