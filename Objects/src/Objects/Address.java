package Objects;

public class Address {
	
	public String city;
	public String street;
	public int number;
	
	public Address(String city, String street, int number) {
		this.city = city;
		this.street = street;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Address: [ city: " + city + ", street: " + street + ", number" + number + " ]";
	}
	

}
