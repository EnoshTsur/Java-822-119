package Runners;

public class Car {

	public String color;
	public int wheelNumber;
	
	public Car(String color, int wheelNumber) {
		this.color = color;
		this.wheelNumber = wheelNumber;
	}
	
	public Car(int wheelNumber) {
		this("yellow", wheelNumber);
	}
	
	 public Car() {}
	
	
	@Override
	public String toString() {
		return String.format("Car[ color: %s, wheels: %d]", color, wheelNumber);
	}
}
