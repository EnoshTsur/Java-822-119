package collections.run;

import java.util.function.UnaryOperator;

public class AddGreeting implements UnaryOperator<String>{

	@Override
	public String apply(String str) {
		return "Hi " + str;
	}

}
