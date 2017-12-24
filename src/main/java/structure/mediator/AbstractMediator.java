package structure.mediator;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractMediator {

	Map<String, AbstractColleague> colleagues = new HashMap<String, AbstractColleague>();

	public void addColleague(AbstractColleague colleague) {
		colleagues.put(colleague.getKey(), colleague);
	};

	public abstract void consultation(AbstractColleague colleague);

}
