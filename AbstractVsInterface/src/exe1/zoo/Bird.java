package exe1.zoo;

public class Bird extends Animal {

	public Bird(String name) {
		super(name);
		this.canFly = true;
	}

	@Override
	public String isFlyAble() {
		return "Hi I'm Bird and i can fly? : " + canFly;
	}

	@Override
	public void sayMyName() {
		System.out.println("Tweet I'm " + name);

	}

}
