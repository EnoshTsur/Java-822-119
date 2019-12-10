package exe2.zoo;

public abstract class Mammal extends Animal{

	protected String pregancyTime;
	
	public Mammal(String name, String pregancyTime) {
		super(name);
		this.pregancyTime = pregancyTime;
	}

	public String getPregancyTime() {
		return pregancyTime;
	}

	public void setPregancyTime(String pregancyTime) {
		this.pregancyTime = pregancyTime;
	}
	
	



}
