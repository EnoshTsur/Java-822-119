package run;

import java.util.function.BiFunction;
import java.util.function.Function;



public class Main {

	public static void main(String[] args) {
		
		
		
		Street a = initPerson
				.andThen(initHome)
				.andThen(initStreet)
				.apply("Enosh", 29);
	}
	
	
	

	
	private static BiFunction<String, Integer, Person> initPerson =
			(name, age ) -> new Person(name, age);
			
	private static Function<Person, Home> initHome = 
			person -> new Home(person);
			
			private static Function<Home, Street> initStreet = 
					home -> new Street(home);
}
