package food;

public class Food {

	private FoodType type;

	public Food(FoodType type) {
		this.type = type;
	}

	public void yumYum() {
		switch (type) {
		case PIZZA:
			System.out.println("Nice love pizza!!");
			break;

		case LAHUH:
			System.out.println("Weird but ok...");
			break;

		case BUREKAS:
			System.out.println("Love Burekas tut");
			break;

		case HAMBURGER:
			System.out.println("Burger cool");
			break;

		case KUBE:
			System.out.println("My grandma likes it");
			break;
		default:
			System.out.println("Not food ?");
		}
	}
}
