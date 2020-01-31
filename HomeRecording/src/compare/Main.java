package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		List<Person> personsList = new ArrayList<>();
		personsList.add(new Person(22, "Zvi"));
		personsList.add(new Person(19, "Avner"));
		personsList.add(new Person(74, "Tuvia"));
		personsList.add(new Person(34, "Guy"));
		
		Collections.sort(personsList);
		
		System.out.println(personsList);
//		
//		personsList.sort(new PersonCompare());
//		
//		Person[] personsArray = {
//				new Person(27),
//				new Person(2),
//				new Person(5)
//		};
//		
//		Arrays.sort(personsArray);
//		
//		
//		
//		System.out.println(Arrays.toString(personsArray));
//		System.out.println(personsList);
	}
}
