package jdbc.entites;

import java.time.LocalDate;

public class User {
	
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private LocalDate birthDate;
	
	public User(long id, String firstName, String lastName, int age, LocalDate birthDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.birthDate = birthDate;
	}

	public User(String firstName, String lastName, int age, LocalDate birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.birthDate = birthDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", birthDate=" + birthDate + "]";
	}
	
	
	
	
	
}
