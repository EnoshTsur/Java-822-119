package zombies;

import java.util.function.Function;

public class ZombieGreet implements Function<String, String>{

	@Override
	public String apply(String name) {
		return "I'm Zombie nice to meet you " +  name;
	}
	

}
