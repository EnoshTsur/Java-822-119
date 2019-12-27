package entities;

public class Knight extends Player {
	
	public Knight() {
		this.attackStrategy = new KnightAttack();
	}

	@Override
	public void attack() {
		this.attackStrategy.attack();
	}

}
