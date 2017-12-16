package stategy_factory;

import strategy.IfStrategy;
import strategy.Strategy1;

public class Strategy1Factory implements IfStrategyFactory {

	@Override
	public IfStrategy create() {
		return new Strategy1();
	}

}
