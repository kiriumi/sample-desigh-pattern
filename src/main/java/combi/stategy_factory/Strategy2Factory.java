package combi.stategy_factory;

import sepalate_process.strategy.IfStrategy;
import sepalate_process.strategy.Strategy2;

public class Strategy2Factory implements IfStrategyFactory {

	@Override
	public IfStrategy create() {
		return new Strategy2();
	}

}
