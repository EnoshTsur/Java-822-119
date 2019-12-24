package collections.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		Collection<String> strings = new ArrayList<String>();
		strings.add("Gill");
		strings.add("Dana");
		

//		
		/***
		 * List
		 */
//		
//		List<String> friends = new ArrayList<String>();
////		// Add
//		friends.add("Yaniv");
//		friends.add("Maor");
//		friends.add("Maor");
//		
//		friends.add(0, "Danny");
//		friends.addAll(strings);
//		friends.addAll(0, Arrays.asList("Efrat", "Nimrod"));
//		
//		//Remove
//		friends.remove(0);
//		friends.remove("Maor");
//		friends.removeAll(strings);
		
//		IsMaor isMaor = new IsMaor();
//		friends.removeIf(isMaor);
//		friends.clear();
		
//		AddGreeting addGreeting = new AddGreeting();
//		friends.replaceAll(addGreeting);
		
//		friends.set(0,  "First instead of Nimrod");
		
//		System.out.printf("friends is empty? : %b\n", friends.isEmpty());
//		System.out.printf("friends contains Maor? : %b\n", friends.contains("Danny"));
//		System.out.printf("friends size : %d\n", friends.size());

//		System.out.println(friends);
//		friends.sort(new FriendsComparator());
//		System.out.println(friends);
		
//		System.out.println(friends);
//		List<String> middle = friends.subList(1, 3);
//		System.out.println(middle);
//		
//		
//		
//		friends.add("Danny");
//		System.out.println(friends);
//		System.out.printf("friends last index of Danny? : %d\n", friends.lastIndexOf("Danny"));
//		System.out.println(friends.get(0));
//		System.out.println(friends);
		
		// Loop over...
//		for(int i = 0; i < friends.size(); i++) {
//			System.out.println(friends.get(i));
//		}
		
//		for (String friend : friends) {
//			System.out.println(friend);
//		}
		
//		Iterator<String> iterator = friends.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
//		ForEveryFriend forEveryFriend = new ForEveryFriend();
//		friends.forEach(forEveryFriend);
		
		/***
		 * Set
		 */

//		Set<String> friends = new HashSet<String>();
//		friends.add("Maor");
//		friends.add("Maor");
//		
//		
//		friends.addAll(strings);
//		System.out.println(friends);
//		System.out.println(friends);
//		System.out.println(friends.containsAll(strings));
		
		/**
		 * Map
		 */
		
		Map<String, Boolean> coolOrNot = new HashMap<String, Boolean>();
		coolOrNot.put("Maor", true);
		coolOrNot.put("Yaniv", false);
		coolOrNot.put("Maxim", true);
		
//		System.out.println(coolOrNot);
//		System.out.println(coolOrNot.get("Maor"));
//		System.out.println(coolOrNot.getOrDefault("Aston", true));
		
		
		// add to key
//		coolOrNot.compute("jhfghfgh", new MaorCompute());
//		coolOrNot.computeIfPresent("Maor", new MaorCompute());
		
//		coolOrNot.remove("Maor");
//		coolOrNot.remove("Maxim", true);
//		System.out.println(coolOrNot);
//		coolOrNot.forEach(new ForEveryEntry());
		
		for (Entry<String, Boolean> entry : coolOrNot.entrySet()) {
//				System.out.println(entry);
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
//		System.out.println(coolOrNot);
		
	}

}
