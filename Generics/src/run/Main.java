package run;

import entities.Cat;
import entities.Horse;
import entities.Pair;

public class Main {

	public static void main(String[] args) {
		
//		Box<Integer> box = new Box<>(56);
//		Box<String> box2 = new Box<>("asd");
//		box.print();
//		box2.print();
		
		/***
		 * 
		 * Enemy : (His name ) & I'm your enemy!!
		 * 
		 * Player: (His name ) & I'm the best!
		 * 
		 * 
		 */
		

		Pair<Horse, Cat> animals = 
				new Pair<>(new Horse("", 2), new Cat("", 23));
		animals.makeASound();
		
		

	}

}
