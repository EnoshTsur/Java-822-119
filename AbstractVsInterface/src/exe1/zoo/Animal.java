package exe1.zoo;

public abstract class Animal {
	
	protected String name;
	
	protected boolean canFly;
	
	public Animal(String name) {
		this.name = name;
	}

	public abstract String isFlyAble();
	
	public abstract void sayMyName();

}
