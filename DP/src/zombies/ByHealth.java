package zombies;

import java.util.function.Predicate;

public class ByHealth implements Predicate<Integer>{

	@Override
	public boolean test(Integer health) {
		return health > 50;
	}

}
