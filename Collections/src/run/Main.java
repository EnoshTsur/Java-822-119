package run;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
//		List<String> friends = new ArrayList<String>();
//		friends.add("yaniv");
//		friends.add("tal");
//		friends.add("maor");
//		friends.add("maor");
//		
//		int indexOfTal = friends.indexOf("tal");
//		if (indexOfTal != -1) {
//			friends.remove(indexOfTal);
//		}
//		
//		System.out.println(friends);
		
//		Set<String> friends = new HashSet<>();
//		friends.add("maor");
//		friends.add("tal");
//		friends.add("danny");
//		friends.add("keren");
//		
//		
//		if(friends.contains("maor")) {
//			friends.remove("maor");
//		}
		
//		Map<String, List<Person>> bodies = new HashMap<>();
//		
//		bodies.put("dev", Arrays.asList(
//				new Person("enosh", 90),
//				new Person("maor", 92),
//				new Person("yaniv", 56)
//			));
//		
//		bodies.put("cooker", Arrays.asList(
//				new Person("Avi", 34),
//				new Person("Iftach", 56)
//		));
//		
//		for (Person person: bodies.get("dev")) {
//			System.out.println(person);
//		}
		
		Map<String, Person> persons = new HashMap<>();
		persons.put("cool", new Person("Iftach", 34));
		
		System.out.println(persons.get("cool"));
		
	}

}
