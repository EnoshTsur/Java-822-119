package run;

public class Home {

	private Person person;

	public Home(Person persons) {
		super();
		this.person = persons;
	}

	public Person getPersons() {
		return person;
	}

	public void setPersons(Person persons) {
		this.person = persons;
	}

	@Override
	public String toString() {
		return "Home [persons=" + person + "]";
	}
	
	
	
}
