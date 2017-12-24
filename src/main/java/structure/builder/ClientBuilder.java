package structure.builder;

import util.Utils;

public class ClientBuilder {

	public static void main(String[] args) {

		Director director1 = new Director(new Builder1());
		Product oroduct1 = director1.construct();
		oroduct1.println();

		Utils.printNewLine();

		Director director2 = new Director(new Builder2());
		Product product2 = director2.construct();
		product2.println();
	}
}
