package Runners;

import Objects.Address;
import Objects.CrazyObject;
import Objects.Person;

public class Runner {

	public static void main(String[] args) {
		
		Address address = new Address("Tel-Aviv", "Bugrashov", 2);
		Person person = new Person("Avner", 74, address);
		
		CrazyObject co = new CrazyObject();
		
		System.out.println(co);
		
	}
	


}
