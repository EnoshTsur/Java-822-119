package inherit_runners;

import inherit_objects.Ninja;
import inherit_objects.Zombie;

public class Run {

	public static void main(String[] args) {

		Ninja ninja = new Ninja("Karlos");
		Zombie zombie = new Zombie("Avner");
		
		ninja.hit(zombie);
		zombie.hit(ninja);
		
		System.out.println(ninja);
		System.out.println(zombie);
	}

}
