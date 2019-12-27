package animals;

public class Main {

	public static void main(String[] args) {
		Bird bird = new Bird();
		Cat cat = new Cat();

		bird.doFly();
		cat.doFly();

		bird.setFlyability(new FlyAbility() {

			@Override
			public void isFlyable() {
				System.out.println("Amazing!");

			}
		});
		
		bird.doFly();

		bird.setFlyability(new FlyAbility() {

			@Override
			public void isFlyable() {
				System.out.println("Something else!");

			}
		});

		bird.doFly();

	}

}
