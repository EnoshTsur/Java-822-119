package animals;

public class Dog extends Animal{

	public Dog(String name, int legs, String color, String breed) {
		super(name, legs, color);
	}
	
	
	@Override
	public void makeASound() {
		System.out.println("Woof!");
	}

}
