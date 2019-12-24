package collections.run;

import java.util.Comparator;

public class FriendsComparator implements Comparator<String>{

	@Override
	public int compare(String friend1, String friend2) {
		return friend1.compareTo(friend2);
	}

}
