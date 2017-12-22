package combi.stategy_factory;

import behavior.strategy.IfStrategy;
import behavior.strategy.Strategy1;

public class Strategy1Factory implements IfStrategyFactory {

	@Override
	public IfStrategy create() {
		return new Strategy1();
	}

}
