package bridge;

import util.Utils;

public class ClientBridge {

	public static void main(String[] args) {

		RefinedAbstraction func1 = new RefinedAbstraction(new Imple1());
		func1.execute();
		func1.newExecute();

		Utils.printNewLine();

		RefinedAbstraction func2 = new RefinedAbstraction(new Imple1());
		func2.execute();
		func2.newExecute();

	}
}
