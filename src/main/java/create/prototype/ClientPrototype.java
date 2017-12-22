package create.prototype;

import util.Utils;

public class ClientPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {

		IfPrototype prototype = new Prototype("Hoge");

		for (int i = 1; i <= 3; i++) {
			IfPrototype cloned = prototype.createClone();
			cloned.execute1();
			cloned.execute2(i);
			Utils.printNewLine();
		}

	}

}
