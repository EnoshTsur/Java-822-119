package entity2;

public class Player extends Entity{

	public Player(String name, int age) {
		super(name, age);
	}

	@Override
	public void talk() {
		System.out.printf("Hi I'm %s and I'm the best\n", this.name);
	}

}
