package inherit_objects;

public class Zombie extends Entity {

	public Zombie(String name) {
		super(name);
		this.health = 68;
		this.power = 3;
		this.xp = 3;
	}
	
	@Override
	public void hit(Entity entity) {
		entity.setHealth(entity.getHealth() - power);
		System.out.println("Zombie style :O ");
	}

	@Override
	public String toString() {
		return "Zombie [name=" + name + ", xp=" + xp + ", power=" + power + ", health=" + health + "]";
	}
	
	

}
