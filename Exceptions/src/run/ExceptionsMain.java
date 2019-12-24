package run;

import exceptions.UnderTwentyException;

public class ExceptionsMain {

	public static void main(String[] args) {
		
		try {			
			int a = 9;
			int b = a / 0;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

		
		System.out.println("After failure");
	}
	
	public static void moreThan20(int num1, int num2, int num3) throws UnderTwentyException {
		int sum = num1 + num2 + num3;
		if (sum < 20) {
			throw new UnderTwentyException("Not cool man...");
		}
	}

}
