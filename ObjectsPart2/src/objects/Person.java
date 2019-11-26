package objects;

public class Person {
	
	private int age;

	public Person(int age) {
		setAge(age);
	}
	
	public int getAge() {
		return age;
	}
	
	private boolean isValidRange(int age) {
		return (age > 0 && age < 121);
	}
	
	public void setAge(int age) {
		if(isValidRange(age)) {
			this.age = age;
		}
		else {
			System.out.println("Age is invalid");
		}
	}
	
	
	
	

}
