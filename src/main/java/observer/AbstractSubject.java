package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import util.Utils;

public abstract class AbstractSubject {

	private List<IfObserver> observers = new ArrayList<IfObserver>();

	public void add(IfObserver observer) {
		observers.add(observer);
	};

	public void remove(IfObserver observer) {
		observers.remove(observer);
	};

	public abstract void notifyOvservers();

	protected List<IfObserver> getObservers() {
		return observers;
	}

	protected Stream<IfObserver> getObserversStream() {
		return observers.stream();
	}

	/** 余興（相互委譲：[Subject] → Observer → Subject） */
	public void a(IfObserver observer) {
		observer.dispatch(this);
	};

	/** 余興（相互委譲：Subject → Observer →[Subject]） */
	public void dispatched() {
		Utils.greet("Double dispatch");
	};

}
