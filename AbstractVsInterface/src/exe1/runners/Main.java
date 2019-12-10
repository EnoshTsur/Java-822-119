package exe1.runners;

import exe1.zoo.Bird;
import exe1.zoo.Dog;

public class Main {

	public static void main(String[] args) {

		boolean canFly = false;
		
		String isFlyable = "Hi I'm dog and i can fly? :" + canFly;
		
		Bird bird = new Bird("Tweety");
		Dog dog = new Dog("Cashew");
		
		System.out.println(bird.isFlyAble());
		System.out.println(dog.isFlyAble());
		
		
	}
	


}
