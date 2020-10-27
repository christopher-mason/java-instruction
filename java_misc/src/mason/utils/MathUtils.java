package mason.utils;

public class MathUtils {

	public static int min(int a, int b) {
		return a < b ? a : b;
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static int sum(int... values) {
		System.out.println("in sum with " + values.length + " values");
		int result = 0;
		for (int value : values) {
			result += value;
		}
		return result;	
	}
	
	public static int power(int value, int raiseTo) {
		if (raiseTo == 0) {
			return 1;
		}
		int result = value;
		for (int i = 1; i < raiseTo; i++) {
			result *= value;
		}
		return result;
	}
	
}
