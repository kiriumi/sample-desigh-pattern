package combi.stategy_factory;

import behavior.strategy.IfStrategy;
import behavior.strategy.Strategy2;

public class Strategy2Factory implements IfStrategyFactory {

	@Override
	public IfStrategy create() {
		return new Strategy2();
	}

}
