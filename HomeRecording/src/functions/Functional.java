package functions;

import java.util.function.Function;

public class Functional {
	
	public static void main(String[] args) {
	
		Function<String, String> greetAvner = greeter("Avner");
		
		System.out.println(greetAvner.apply("Hi"));
		System.out.println(greetAvner.apply("Bye"));
		System.out.println(greeter("Itay").apply("Goodbye"));
		
	
	}
	

	public static Function<String, String> greeter(String name) {
		return greetText -> greetText + " " + name;
	}
}

