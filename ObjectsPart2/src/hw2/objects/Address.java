package hw2.objects;

public class Address {

	// attributes
	private String city;
	private String street;
	private int number;

	/**
	 * CTR - All Arguments
	 * @param city
	 * @param street
	 * @param number
	 */
	public Address(String city, String street, int number) {
		this.city = city;
		this.street = street;
		this.number = number;
	}

	// Getters & Setters
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	// To String

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", number=" + number + "]";
	}
	
	
	
	
}
