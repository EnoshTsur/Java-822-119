package exe2.zoo;

public class Dolphin extends Mammal implements FlyAble{

	public Dolphin(String name) {
		super(name, "12 months");
	}

	@Override
	public String canFly() {
		return "Dolphin can fly ? " + this.canFly;
	}


}
