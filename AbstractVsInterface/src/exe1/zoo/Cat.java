package exe1.zoo;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
		this.canFly = false;
	}

	@Override
	public void sayMyName() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String isFlyAble() {
		return "Hi I'm Cat and i can fly? : " + canFly;
	}

}
