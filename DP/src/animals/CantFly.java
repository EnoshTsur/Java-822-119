package animals;

public class CantFly implements FlyAbility{

	@Override
	public void isFlyable() {
		System.out.println("Damn I cant fly... :(");
		
	}

}
