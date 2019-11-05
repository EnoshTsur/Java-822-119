package flow.conditions;

public class Turnary {

	public static void main(String[] args) {

		int age = (int) (Math.random() * 50) + 10;

//		String name = age < 20 ? "kobi" : "yaniv";

		String name = (age < 20) ? "kobi" : (age >= 20 && age < 30) ? "yaniv" : "else";

		System.out.printf("name: %s\nage: %d", name, age);
	}
}
