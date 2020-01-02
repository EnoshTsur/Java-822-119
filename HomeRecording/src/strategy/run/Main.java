package strategy.run;

import strategy.animals.Bird;
import strategy.animals.Cat;
import strategy.animals.MaybeFly;

public class Main {

	public static void main(String[] args) {
		Bird bird = new Bird();
		Cat cat = new Cat();
		
		bird.canFly();
		bird.setFlyAbility(new MaybeFly());
		bird.canFly();
		

	}

}
