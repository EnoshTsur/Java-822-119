package zombies;

public class Zombie extends Entity{
	
	public Zombie() {
		attackStrategy = new ZombieAttack();
		isAlive = new ByXp();
		greet = new PlayerGreet();
	}

	@Override
	public void attack(String name) {
		System.out.print("Im Zomby! ");
		attackStrategy.accept(name);;
	}

	@Override
	public void printIsAlive(int xp) {
		System.out.println("Is Alive: " + isAlive.test(xp));
		
	}

	@Override
	public void printGreeting(String name) {
		System.out.println(greet.apply(name));
		
	}

}
