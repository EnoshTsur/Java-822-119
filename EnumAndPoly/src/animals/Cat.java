package animals;

public class Cat extends Animal {
	

	public Cat(String name) {
		super(name);
		this.legs = 6;
		
	}

	@Override
	public void speak() {
		System.out.println("Mew " + getName());
		
	}

	@Override
	public void talkAboutMyLegs() {
		System.out.println(
				"Hi im cat and i have " + legs + " legs"
		);
		
	}

}
