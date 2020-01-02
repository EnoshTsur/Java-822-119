package strategy.animals;

public class CantFly implements FlyAbility{

	@Override
	public void canFly() {
		System.out.println("No I cant fly!");
		
	}

}
