package generics.run;

import generics.generics.Box;
import heq_objects.Person;

public class Main {

	public static void main(String[] args) {
		
		Person kobi = new Person("Kobi", 32);
		
		Box<String> box = new Box<>("Some String");
		Box box1 = new Box(9);
		Box box2 = new Box(true);
		Box box3 = new Box(kobi);
		
		String some = box.getContent();
//		box.setContent(34);
		

		
		

	}

}
