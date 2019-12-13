package animals;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		this.legs = 7;
	}

	@Override
	public void speak() {
		System.out.println("Woof " + getName() );
		
	}

	@Override
	public void talkAboutMyLegs() {
		System.out.println(
				"Hi im dog and i have " + legs + " legs"
		);
		
	}

}
