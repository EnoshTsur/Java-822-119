package entities;

public abstract class Player {
	
	protected Attack attackStrategy;
	
	public Player() {}
	
	public abstract void attack();
	
	public Attack getAttack() {
		return attackStrategy;
	}
	
	public void setAttack(Attack attack) {
		this.attackStrategy = attack;
	}

	
}
