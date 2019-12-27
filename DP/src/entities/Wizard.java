package entities;

public class Wizard extends Player{
	
	public Wizard() {
		this.attackStrategy = new WizardAttack();
	}

	@Override
	public void attack() {
		this.attackStrategy.attack();
	}

}
