package sepalate_process.observer;

import java.util.stream.Stream;

import util.Utils;

public class Subject extends AbstractSubject {

	@Override
	public void notifyOvservers() {

		Stream<IfObserver> stream = getObserversStream();

		stream.forEach(observer -> {
			observer.update(this);
			Utils.printNewLine();
		});
	}

}
