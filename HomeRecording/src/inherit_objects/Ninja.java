package inherit_objects;

public class Ninja extends Entity {

	public Ninja(String name) {
		super(name);
		this.health = 100;
		this.xp = 0;
		this.power = 6;
	}

	@Override
	public void hit(Entity entity) {
		entity.setHealth(entity.getHealth() - power);
		System.out.println("Ninja style *");
	}
	
	@Override
	public String toString() {
		return "Ninja [name=" + name + ", xp=" + xp + ", power=" + power + ", health=" + health + "]";
	}
	
	

}
