package abstractclass.animals;

public class Dog extends Animal {

	public Dog(String name, String color, int legs) {
		super(name, color, legs);
	}

	@Override
	public void speak() {
		System.out.println("Woof");
	}
	
	public void hi() {
		
	}
	


}
