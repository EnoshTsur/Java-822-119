package Objects;

public class User {
	
	public String username;
	public int age;
	public String email;
	
	public User(String username, int age, String email) {
		this.username = username;
		this.age = age;
		this.email = email;
		System.out.println("CTOR1");
	}
	
	public User(String username, int age) {
		this(username, age, "something@gmail.com");
		System.out.println("CTOR2");
	}
	
	public User() {
		this("Yuval", 23);
		System.out.println("CTOR3");
		
	}
	

	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + ", email=" + email + "]";
	}
	
	

}
