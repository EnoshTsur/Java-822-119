package Runners;

import Objects.Calc;

public class UserMain {

	public static void main(String[] args) {

//		User user = new User("Avner", 74, "avner@yahoo.com");
		
		Calc calc = new Calc();
		int ten = calc.devide(100, 2);
		System.out.println(ten);
	}
}
