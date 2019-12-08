package inherit_objects;

public class Entity {

	protected String name;
	protected int xp;
	protected int power;
	protected int health;
	
	public Entity(String name) {
		this.name = name;
	}
	
	public void hit(Entity entity) {
		entity.setHealth(entity.getHealth() - power);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "Entity [name=" + name + ", xp=" + xp + ", power=" + power + ", health=" + health + "]";
	}
	
	
}
