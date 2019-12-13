package run;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Horse;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat("Mitsy");
		Dog dog = new Dog("Cahsew");
		Horse horse = new Horse("Moti");

		Animal[] zoo = { cat, dog, horse };

		for (Animal animal : zoo) {
			animal.talkAboutMyLegs();
		}

	}

}
