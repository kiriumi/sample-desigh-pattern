package util;

import org.apache.commons.io.FilenameUtils;

public final class Utils {

	private Utils() {

	}

	public static void giveMyName(Object obj) {
		System.out.println("I'm " + getSimpleClassName(obj));
	}

	public static void greet(String name) {
		System.out.println("Hello " + name);
	}

	public static void greet(Object obj) {
		System.out.println("Hello " + getSimpleClassName(obj));
	}

	public static void welcome(Object obj) {
		System.out.println("Welcome " + getSimpleClassName(obj));
	}

	public static void printNewLine() {
		System.out.println();
	}

	public static String getSimpleClassName(Object obj) {
		return obj.getClass().getSimpleName();
	}

	public static void whoDidIt() {

		StackTraceElement targetStackTrace = Thread.currentThread().getStackTrace()[2];

		String className = FilenameUtils.getBaseName(targetStackTrace.getFileName());
		String methodName = targetStackTrace.getMethodName();

		System.out.println(className + " done " + methodName);
	}
}
