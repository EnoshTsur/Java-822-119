package abstractclass.animals;

public class Cat extends Animal{

	public Cat(String name, String color, int legs) {
		super(name, color, legs);
	}

	@Override
	public void speak() {
		System.out.println("Mew");
	}

	public void onlyCat() {
		
	}
	

}
