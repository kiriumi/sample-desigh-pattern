package combi.stategy_factory;

import sepalate_process.strategy.IfStrategy;
import sepalate_process.strategy.Strategy1;

public class Strategy1Factory implements IfStrategyFactory {

	@Override
	public IfStrategy create() {
		return new Strategy1();
	}

}
