package animalGetters;

public class Animal {

	private String type;
	private String[] types = { "lion", "zebra", "horse", "dog" };

	private String unknown = "unkown";

	public Animal(String type) {
		setType(type);

	}

	public void setType(String type) {
		boolean isInTypes = false;

		for (String kind : types) {
			if (kind.equals(type)) {
				isInTypes = true;
				break;
			}
		}

		if (isInTypes) {
			this.type = type;
		} else {
			System.out.println("Unknown type");
			this.type = unknown;
		}
	}

	public String getType() {
		return this.type;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + "]";
	}

}
