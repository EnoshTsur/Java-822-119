package gs_objects;

public class Zoo {

	private String myAnimal;
	private String defaultValue = "unknown";
	
	private String[] animals = {
		"zebra", "lion", "cat", "dog", "horse"	
	};
	
	public Zoo(String myAnimal) {
		setMyAnimal(myAnimal);
	}
	
	
	
	private void printErrorMessage(String next) {
		System.out.println("Cannot initial myAnimal with " + next);
	}
	
	private boolean isInAnimals(String myAnimal) {
		boolean isExist = false;
		for (String animal : animals) {
			if (myAnimal.equalsIgnoreCase(animal)) {
				isExist = true;
				break;
			}
		}
		return isExist;
	}
	
	public void setMyAnimal(String myAnimal) {
		if(myAnimal == null) {
			printErrorMessage("with null value");
			this.myAnimal = defaultValue;
			return;
		}
		myAnimal = myAnimal.trim();
		if(myAnimal.isEmpty()) {
			printErrorMessage("empty string");
			this.myAnimal = defaultValue;
			return;
		}
		
		if (!isInAnimals(myAnimal)) {
			printErrorMessage("unknown animal: " + myAnimal);
			this.myAnimal = defaultValue;
			return;
		}
		this.myAnimal = myAnimal;
	}
	
	public String getMyAnimal() {
		return myAnimal;
	}

	public String[] getAnimals() {
		return animals;
	}
	
	
}
