package interfaces.run;

import java.util.function.BiFunction;

public class StringLength implements BiFunction<String, String, Integer>{

	@Override
	public Integer apply(String t, String e) {
		return t.length() + e.length();
	}

}
