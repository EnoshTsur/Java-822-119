package zombies;

import java.util.function.Function;

public class PlayerGreet implements Function<String, String>{

	@Override
	public String apply(String name) {
		return "I'm Player nice to meet you " +  name;
	}
	

}
