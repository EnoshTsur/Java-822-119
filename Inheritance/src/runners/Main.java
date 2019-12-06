package runners;

import animals.Cat;
import animals.Dog;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Cashew", 4, "Black & Tan", "mixed");
		Cat cat = new Cat("Mitsy", 4, "Blue");
		
		cat.makeASound();
		dog.makeASound();

	}

}
