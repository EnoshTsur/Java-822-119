package run5;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {
	
	
	public static void main(String[] args) {

//		Predicate<String> lengthAboveZero = str -> str.length() > 0;
//		Runnable printHaha = () -> System.out.println("hahahahahahah");		
//		
//		ifTrueRun(lengthAboveZero, "Enosh", printHaha); 
		
//		BiFunction<Integer, Integer, Integer> add = (num1, num2) -> {
//			return num1 + num2;
//		};
//		
//		Function<Integer, Integer> addTenTo = num -> num + 10;
//		
//		System.out.println(
//				add
//				.andThen(addTenTo)
//				.andThen(y -> y * 7)
//				.apply(2, 3)
//				
//		);
//		System.out.println(add.andThen(x -> x + 2).andThen(y -> y * 2).apply(2, 3));
	
//		Function<Integer, Integer> add2 = add(2);
//		System.out.println(add2.apply(3));
//		System.out.println(add2.apply(5));
		
		System.out.println(add(3).apply(2));
		
		
		
//		
//		System.out.println(add(5).apply(2));
//	public static void ifTrueRun(Predicate<String> tester, String subject, Runnable action) {
//		if(tester.test(subject)) {
//			action.run();
//		}
		
		BiFunction<String, String, String> x = (f, l) -> f + " " + l;
		
		System.out.println(x.andThen(full -> "Hi " + full).apply("Enosh", "Tsur"));
		
	}
	
	
	public static Function<Integer, Integer> add(int num1) {
		return (num2) -> num1 + num2;
	}
}

class Person {
	
	int age = 0;
	
	public Person add() {
		age++;
		return this;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}
	
	
}


