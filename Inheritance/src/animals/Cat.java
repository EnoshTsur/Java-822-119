package animals;

public class Cat extends Animal{

	public Cat(String name, int legs, String color) {
		super(name, legs, color);
	}
	
	@Override
	public void makeASound() {
		System.out.println("Miyahoo!");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", legs=" + legs + ", color=" + color + "]";
	}
	
	

}
