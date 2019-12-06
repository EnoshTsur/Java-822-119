package animals;

public class Animal {

	protected String name;
	
	protected int legs;
	
	protected String color;

	public Animal(String name, int legs, String color) {
		this.name = name;
		this.legs = legs;
		this.color = color;
	}
	
	public Animal(String name, int legs) {
		this(name, legs, "black");
	}
	
	
	public void makeASound() {
		System.out.println("?");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", legs=" + legs + ", color=" + color + "]";
	}
	
	
	
	
}
