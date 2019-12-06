package task;

public class Driver extends Person {

	public String bloodType;
	

	public Driver(String name, int id, int age, String bloodType) {
		super(name, id, age);
		this.bloodType = bloodType;
		
	}
	
	public void printDriver() {
		printBasic();
		System.out.println("Blood Type: " + bloodType);
	}

}
