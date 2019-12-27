package zombies;

import java.util.function.Consumer;

public class PlayerAttack implements Consumer<String>{

	@Override
	public void accept(String name) {
		System.out.printf("%s fear of the best player!\n", name);
		
	}


}
