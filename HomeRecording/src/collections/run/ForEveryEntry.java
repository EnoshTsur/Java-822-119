package collections.run;

import java.util.function.BiConsumer;

public class ForEveryEntry implements BiConsumer<String, Boolean>{

	@Override
	public void accept(String key, Boolean value) {
		System.out.println("Key: " + key + ", Value: " + value);
		
	}

}
