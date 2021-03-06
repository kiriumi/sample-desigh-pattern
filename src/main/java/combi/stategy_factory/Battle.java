package combi.stategy_factory;

import sepalate_process.strategy.IfStrategy;

public class Battle {

	private final String name;

	private final IfStrategy stragety;

	public Battle(String name, IfStrategyFactory factory) {

		this.name = name;
		this.stragety = factory.create();
	}

	public void executeStragety() {
		System.out.print(name + ": ");
		stragety.execute();
	}

}
