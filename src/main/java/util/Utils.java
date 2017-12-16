package util;

public final class Utils {

	private Utils() {

	}

	public static String getSimpleClassName(Object obj) {
		return obj.getClass().getSimpleName();
	}
}
