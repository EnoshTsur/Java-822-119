package exe1.zoo;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		canFly = false;
	}

	@Override
	public void sayMyName() {
		System.out.println("Woof im " + this.name);
	}
	
	@Override
	public String isFlyAble() {
		return "Hi I'm Dog and i can fly? : " + canFly;
	}

}
