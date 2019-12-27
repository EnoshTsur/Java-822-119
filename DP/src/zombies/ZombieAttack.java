package zombies;

import java.util.function.Consumer;

public class ZombieAttack implements Consumer<String>{

	@Override
	public void accept(String name) {	
		System.out.printf("Hahaha %s beware of the zombie attack! \n", name);
		
	}



}
