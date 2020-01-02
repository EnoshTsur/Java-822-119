package strategy.animals;

public class Bird extends Animal{
	
	public Bird() {
		flyAbility = new CanFly();
	}

	@Override
	public void canFly() {
		System.out.print("Bird: ");
		flyAbility.canFly();
	}

}
