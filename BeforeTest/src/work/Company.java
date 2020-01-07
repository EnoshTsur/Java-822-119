package work;

import java.util.Arrays;

public class Company {

	private String name;
	private WorkPlace[] workPlaces;
	
	public Company(String name) {
		this.name = name;
		this.workPlaces = new WorkPlace[Department.values().length];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkPlace[] getWorkPlaces() {
		return workPlaces;
	}

	public void setWorkPlaces(WorkPlace[] workPlaces) {
		this.workPlaces = workPlaces;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", workPlaces=" + Arrays.toString(workPlaces) + "]";
	}
	
	
	
}
