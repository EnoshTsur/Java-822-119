package entity2;

public class Enemy extends Entity{

	public Enemy(String name, int age) {
		super(name, age);
	}

	@Override
	public void talk() {
		System.out.printf("Hi I'm %s and I'm your enemy!\n", this.name);
	}

}
