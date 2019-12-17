package runner;

import entities.Animal;
import entities.Cat;
import entities.Dog;

public class Main {
	
	public static void main(String[] args) {
		
		
		Box<? super Animal, ? super Animal> a = new Box<>();
		
		a.setT(new Dog("Yoshi", 23));
		a.setE(new Cat("Yuvi", 23));
		
		Dog dog = (Dog) a.getT();
		Cat cat = (Cat) a.getE();
		
		dog.speak();
		cat.speak();
		
		Box<? super Animal, ? super Animal> b = new Box<>();
		
		
		
	}

}
