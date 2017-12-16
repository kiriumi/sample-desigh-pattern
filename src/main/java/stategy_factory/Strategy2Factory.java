package stategy_factory;

import strategy.IfStrategy;
import strategy.Strategy2;

public class Strategy2Factory implements IfStrategyFactory {

	@Override
	public IfStrategy create() {
		return new Strategy2();
	}

}
