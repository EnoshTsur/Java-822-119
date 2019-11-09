package Run;

public class LoopOverArrays {

	public static void main(String[] args) {
		
		String[] friends = {
				"Gill", "Efrat", "Nimrod", "Dana"
		};

		
//		int position = 0;
//		
//		while(position < friends.length) {
//			System.out.println(friends[position]);
//			position++;
//		}
		
//		for (int i = 0; i < friends.length; i++) {
//			System.out.printf("Friend '%s' at position %d\n", friends[i], i);
//		}
		
		for (String friend : friends) {
			System.out.printf(
					"%s %s\n", 
					friend,
					(friend.equals("Efrat") ? "Malka!" : "nice..")
			);
		}

	}

}
