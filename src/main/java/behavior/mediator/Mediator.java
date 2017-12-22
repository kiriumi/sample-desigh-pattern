package behavior.mediator;

public class Mediator extends AbstractMediator {

	@Override
	public void consultation(AbstractColleague colleague) {

		colleagues.forEach((key, tempcolleague) -> {

			if (key.equals(colleague.getKey())) {
				colleague.execute1();

			} else {
				tempcolleague.execute2();
			}

		});

	}

}
