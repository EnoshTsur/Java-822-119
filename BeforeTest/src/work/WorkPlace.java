package work;

import java.util.Arrays;

import entities.Boss;
import entities.Employee;

public class WorkPlace {
	
	private Department department;
	private Boss boss;
	private Employee[] emps;

	public WorkPlace(Department department, Boss boss, Employee[] emps) {
		this.department = department;
		this.boss = boss;
		this.emps = emps;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Boss getBoss() {
		return boss;
	}

	public void setBoss(Boss boss) {
		this.boss = boss;
	}

	public Employee[] getEmps() {
		return emps;
	}

	public void setEmps(Employee[] emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "WorkPlace [department=" + department + ", boss=" + boss + ", emps=" + Arrays.toString(emps) + "]";
	}
	
	

}
