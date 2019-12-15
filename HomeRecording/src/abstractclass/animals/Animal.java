package abstractclass.animals;

public abstract class Animal {
	
	protected String name;
	protected String color;
	protected int legs;
	
	public Animal(String name, String color, int legs) {
		this.name = name;
		this.color = color;
		this.legs = legs;
	}
	
	public abstract void speak();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	
	
	
}
