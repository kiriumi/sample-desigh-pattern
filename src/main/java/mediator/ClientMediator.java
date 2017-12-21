package mediator;

public class ClientMediator {

	public static void main(String[] args) {

		AbstractMediator mediator = new Mediator();

		AbstractColleague colleague1 = new Colleague("1");
		AbstractColleague colleague2 = new Colleague("2");

		mediator.addColleague(colleague1);
		mediator.addColleague(colleague2);

		colleague1.setMediator(mediator);
		colleague2.setMediator(mediator);

		colleague1.needAdvice();
	}
}
