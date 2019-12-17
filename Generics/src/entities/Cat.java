package entities;

public class Cat extends Animal{

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void speak() {
		System.out.println("Mew");		
	}

}
