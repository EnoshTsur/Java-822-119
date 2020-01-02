package interfaces.run;

import java.util.function.BiConsumer;

public class PrintSomething implements BiConsumer<String, Integer>{

	@Override
	public void accept(String t, Integer i) {
		System.out.println("Cool printing this: " + t + ", number: " + i);
		
	}

}
