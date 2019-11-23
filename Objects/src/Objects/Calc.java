package Objects;

public class Calc {

	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int multiple(int num1, int num2) {
		return num1 * num2;
	}
	
	public int devide(int num1, int num2) {
		if( num1 == 0 || num2 == 0) {
			System.out.println("Can not devide by zero");
			return 0;
		}
		return num1 / num2;
	}

}
