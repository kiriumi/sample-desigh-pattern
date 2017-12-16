package factorymethod;

public final class Factory {

	public static IfProduct create(int i) {

		if (i == 1) {
			return new Product1();
		} else {
			return new Product2();
		}
	}
}
