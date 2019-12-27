package animals;

public abstract class Animal {

	protected FlyAbility flyability;
	
	public Animal() {}
	
	public void doFly() {
		flyability.isFlyable();
	}

	public void setFlyability(FlyAbility flyability) {
		this.flyability = flyability;
	}
	
	
}
