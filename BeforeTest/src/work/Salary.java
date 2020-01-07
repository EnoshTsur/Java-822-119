package work;

import java.util.Arrays;

public class Salary {

	private int[] salaries;
	
	public Salary() {
		this.salaries = new int[12];
	}

	public int[] getSalaries() {
		return salaries;
	}

	public void setSalaries(int[] salaries) {
		this.salaries = salaries;
	}

	@Override
	public String toString() {
		return "Salary [salaries=" + Arrays.toString(salaries) + "]";
	}
	
	
}
