package strategy.animals;

public class Cat extends Animal{
	
	public Cat() {
		flyAbility = new CantFly();
	}

	@Override
	public void canFly() {
		System.out.print("Cat: ");
		flyAbility.canFly();
		
	}

}
