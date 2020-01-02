package strategy.animals;

public abstract class Animal {
	
	protected FlyAbility flyAbility;
	
	public abstract void canFly();
	
	public void setFlyAbility(FlyAbility flyAbility) {
		this.flyAbility = flyAbility;
	}

}
