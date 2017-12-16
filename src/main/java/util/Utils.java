package util;

public final class Utils {

	private Utils() {

	}

	public static void greet(Object obj) {
		System.out.println("Hello " + getSimpleClassName(obj));
	}

	public static String getSimpleClassName(Object obj) {
		return obj.getClass().getSimpleName();
	}
}
