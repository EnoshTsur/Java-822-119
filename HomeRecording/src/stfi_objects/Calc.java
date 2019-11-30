package stfi_objects;

public class Calc {

	public static String name;
	public final static double version = 1.0; 
	
	static {
		name = "My Calc";
	}
	
	public final static char[] OPERATORS = {
		'+', '-', '*', '/'	
	};
	
	private static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	private static int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	private static int multiple(int num1, int num2) {
		return num1 * num2;
	}
	
	private static int devide(int num1, int num2) {
		if(num1 == 0 || num2 == 0) {
			System.out.println("Cannot devide by zero");
			return 0;
		}
		return num1 / num2;
	}
	
	public static int action(char operator, int num1, int num2) {
		if(OPERATORS[0] == operator) {
			return add(num1, num2);
		}
		if(OPERATORS[1] == operator) {
			return subtract(num1, num2);
		}
		if(OPERATORS[2] == operator) {
			return multiple(num1, num2);
		}
		if(OPERATORS[3] == operator) {
			return devide(num1, num2);
		}
		System.out.println("Invalid operator");
		return 0;
	}
}
