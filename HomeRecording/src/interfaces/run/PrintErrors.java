package interfaces.run;

import java.util.function.Consumer;

public class PrintErrors implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.err.println("Error printing this: " + t);
		
	}

}
