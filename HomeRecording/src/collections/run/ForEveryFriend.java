package collections.run;

import java.util.function.Consumer;

public class ForEveryFriend implements Consumer<String>{

	@Override
	public void accept(String friend) {
		System.out.println(friend + " 7");
	}

}
