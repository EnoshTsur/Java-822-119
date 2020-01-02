package interfaces.run;

import java.util.function.Predicate;

public class IsMaor implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.trim().equalsIgnoreCase("maor");
	}

}
