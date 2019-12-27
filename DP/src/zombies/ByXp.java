package zombies;

import java.util.function.Predicate;

public class ByXp implements Predicate<Integer>{

	@Override
	public boolean test(Integer xp) {
		return xp > 1000;
	}

}
