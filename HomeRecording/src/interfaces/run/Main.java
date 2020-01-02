package interfaces.run;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		BiFunction<String, String, Integer> getStrLength = new StringLength();
		int maorLength = getStrLength.apply("maor", "danny");
		System.out.println(maorLength);

	}

}


class Person {
	
	String name;
	
	private Predicate<String> isSomething;

	public Person(String name, Predicate<String> isSomething) {
		this.name = name;
		this.isSomething = isSomething;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Predicate<String> getIsSomething() {
		return isSomething;
	}

	public void setIsSomething(Predicate<String> isSomething) {
		this.isSomething = isSomething;
	}


}
