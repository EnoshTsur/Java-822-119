package animals;

public abstract class Animal {
	
	protected String name;
	protected int legs;
	
	public abstract void speak();
	
	public abstract void talkAboutMyLegs();
	
	public void hooo() {
		System.out.println("asdfsd");
	}

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
