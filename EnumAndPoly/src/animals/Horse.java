package animals;

public class Horse extends Animal {

	public Horse(String name) {
		super(name);
		this.legs = 4;
	}

	@Override
	public void speak() {
		System.out.println("Yee ahh " + getName() );
		
	}

	@Override
	public void talkAboutMyLegs() {
		System.out.println(
				"Hi im horse and i have " + legs + " legs"
		);
		
	}

}
