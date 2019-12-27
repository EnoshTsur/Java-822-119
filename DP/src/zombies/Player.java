package zombies;

public class Player extends Entity{

	public Player() {
		attackStrategy = new PlayerAttack();
		isAlive = new ByHealth();
		greet = new PlayerGreet();
	}
	
	@Override
	public void attack(String name) {
		System.out.print("Im Player! ");
		attackStrategy.accept(name);
	}

	@Override
	public void printIsAlive(int health) {
		System.out.println("Is Alive? " + isAlive.test(health));
		
	}

	@Override
	public void printGreeting(String name) {
		System.out.println(greet.apply(name));
		
	}

}
