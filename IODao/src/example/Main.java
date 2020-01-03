package example;

import java.io.File;
import java.io.Serializable;

public class Main {

	public static void main(String[] args) {
		File path = new File("./src/example/persons.dat");
		
		Dao<Person> personDao = new DaoIO<>(path);
		
		Person p = new Person(34);
		personDao.write(p);
		
		Person p2 = personDao.read();
		System.out.println(p2);

	}

}

class Person implements Serializable{
	
	
	private int age;

	public Person(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}
	
	
}