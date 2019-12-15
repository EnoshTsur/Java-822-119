package abstractclass.runner;

import abstractclass.animals.Cat;
import abstractclass.animals.Dog;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat("Shalom", "Red", 4);
		Dog dog = new Dog("Elad", "Yellow", 4);
		
		dog.speak();
		cat.speak();
	}

}
