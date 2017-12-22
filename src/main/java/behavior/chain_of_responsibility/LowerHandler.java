package behavior.chain_of_responsibility;

import util.Utils;

public class LowerHandler extends AbstractHandler {

	private int level = Question.EASY.getLevel();

	@Override
	public void request(Question question) {

		if (question.getLevel() <= level) {
			System.out.println(
					Utils.getSimpleClassName(this)
							+ " can answer " + question.getMessage());

		} else {
			getNext().request(question);

		}
	}

}
