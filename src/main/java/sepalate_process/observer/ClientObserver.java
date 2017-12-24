package sepalate_process.observer;

public class ClientObserver {

	public static void main(String[] args) {

		AbstractSubject subject = new Subject();

		IfObserver observer1 = new Observer1();
		IfObserver observer2 = new Observer2();

		subject.add(observer1);
		subject.add(observer2);

		subject.notifyOvservers();
	}

}
