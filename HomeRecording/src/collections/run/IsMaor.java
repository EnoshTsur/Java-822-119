package collections.run;

import java.util.function.Predicate;

public class IsMaor implements Predicate<String>{

	
	@Override
	public boolean test(String candidate) {
		return candidate.trim().equalsIgnoreCase("maor");
	}

}
