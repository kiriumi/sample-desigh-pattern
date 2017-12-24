package chain_of_process.chain_of_responsibility;

public class ClientChainOfResponsibility {

	public static void main(String[] args) {

		AbstractHandler lower = new LowerHandler();
		AbstractHandler upper = new UpperHandler();
		AbstractHandler highest = new HighestHandler();

		lower.setNext(upper).setNext(highest);

		lower.request(Question.EASY);
		lower.request(Question.NORMAL);
		lower.request(Question.HARD);
		lower.request(Question.EXPERT);

	}
}
