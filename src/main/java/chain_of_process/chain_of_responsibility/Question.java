package chain_of_process.chain_of_responsibility;

import java.util.EnumSet;

public enum Question {

	EASY("Easy question", 10),

	NORMAL("Normal question", 20),

	HARD("Hard question", 30),

	EXPERT("Expert question", 40);

	private static final EnumSet<Question> QUESTION_SET = EnumSet.allOf(Question.class);

	private final String message;

	private final int level;

	private Question(String message, int level) {

		this.message = message;
		this.level = level;
	}

	public String getMessage() {
		return message;
	}

	public int getLevel() {
		return level;
	}

	public static Question getQuestion(int level) {

		return QUESTION_SET.stream()
				.filter(question -> question.getLevel() > level)
				.findFirst()
				.orElse(Question.EASY);
	}

}
