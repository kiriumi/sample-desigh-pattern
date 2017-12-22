package chain_of_responsibility;

import util.Utils;

public class HighestHandler extends AbstractHandler {

	private int level = Question.HARD.getLevel();

	@Override
	public void request(Question question) {

		if (question.getLevel() <= level) {
			System.out.println(
					Utils.getSimpleClassName(this)
							+ " can answer " + question.getMessage());

		} else {
			System.out.println("No one can answer " + question.getMessage());

		}
	}

}
