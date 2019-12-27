package zombies;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class Entity {
	
	protected Consumer<String> attackStrategy;
		
	protected Predicate<Integer> isAlive;
	
	protected Function<String, String> greet;
	
	public Entity() {}

	public abstract void attack(String name);

	public abstract void printIsAlive(int health);
	
	public abstract void printGreeting(String name);
	
	public void setAttackStrategy(Consumer<String> attackStrategy) {
		this.attackStrategy = attackStrategy;
	}

	public void setIsAlive(Predicate<Integer> isAlive) {
		this.isAlive = isAlive;
	}
	
	
	
	
}
