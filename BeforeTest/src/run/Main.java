package run;

import java.util.Arrays;

import entities.Boss;
import entities.Employee;
import entities.PersonType;
import work.Department;

public class Main {

	public static void main(String[] args) {

		Employee[] devs = { new Employee("Aston", 32), new Employee("Victor", 60), new Employee("Avi", 37) };
		Employee[] qas = { new Employee("Oren", 43), new Employee("Sapir", 23), new Employee("Helly", 47) };
		Employee[] hrs = { new Employee("Nitza", 42), new Employee("Tomer", 26), new Employee("Kineret", 57) };
		Employee[] graphs = { new Employee("Nitsan", 35), new Employee("Daniel", 31), new Employee("Max", 35) };
		
		
		Boss devBoss = new Boss("Tomer", 35);
		Boss qaBoss = new Boss("Slava", 29);
		Boss hrBoss = new Boss("Ofer", 45);
		Boss graphBoss = new Boss("Johnny", 31);

		// Employee
		initEmployees(devs, Department.DEV);
		initEmployees(qas, Department.QA);
		initEmployees(hrs, Department.HR);
		initEmployees(graphs, Department.GRAPHICS);
		
		// Boss
		initBoss(devBoss, Department.DEV);
		initBoss(qaBoss, Department.QA);
		initBoss(hrBoss, Department.HR);
		initBoss(graphBoss, Department.GRAPHICS);
		
		Employee[][] allEmployees = {
				devs, qas, hrs, graphs
		};
		
		Boss[] allBoss = {
				devBoss, qaBoss, hrBoss, graphBoss
		};
	
		
		System.out.println("_______Employees________");

		for (Employee[] employees : allEmployees) {
			for (Employee employee : employees) {
				System.out.println(
						employee.getName() + " " +
								Arrays.toString(employee.getSalary().getSalaries())
						);
			}
			
			System.out.println("--------------------------");
		}
		
		System.out.println("_______Bosses________");
		
		for (Boss boss : allBoss) {
			System.out.println(boss.getName() + " " + 
					Arrays.toString(boss.getSalary().getSalaries())
					);
		}

	}

	
	public static int[] getRange(PersonType personType, Department department) {
		switch(personType) {
			case BOSS:
				return getBossRange(department);
			case EMPLOYEE:
				return getEmployeeRange(department);
				default:
					return new int[] {-1, -1};
		}
	}
	
	public static int[] getBossRange(Department department) {
		switch (department) {
		case DEV:
			return new int[] { 32000, 35000 };
		case QA:
			return new int[] { 14000, 18000 };
		case GRAPHICS:
			return new int[] { 18000, 20000 };
		case HR:
			return new int[] { 15000, 16000 };
			default:
				return new int[] { -1, -1 };
		}
	}
	
	public static int[] getEmployeeRange(Department department) {
		switch (department) {
		case DEV:
			return new int[] { 14000, 18000 };
		case QA:
			return new int[] { 8000, 12000 };
		case GRAPHICS:
			return new int[] { 14000, 16000 };
		case HR:
			return new int[] { 10000, 12000 };
			default:
				return new int[] { -1, -1 };
		}
	}
	
	
	
	public static void initEmployees(Employee[] employees, Department department) {
		int[] range = getRange(PersonType.EMPLOYEE, department);
		
		for (Employee currentEmployee : employees) {

			int[] salaries = currentEmployee.getSalary().getSalaries();

			for (int i = 0; i < salaries.length; i++) {
				salaries[i] = (int) (Math.random() * (range[1] - range[0])) + range[0];
			}
		}
	}

	
	
	

	public static void initBoss(Boss boss, Department department) {
		int[] range = getRange(PersonType.BOSS, department);
		int[] bossSalary = boss.getSalary().getSalaries();

		for (int i = 0; i < bossSalary.length; i++) {
			bossSalary[i] = (int) (Math.random() * (range[1] - range[0])) + range[0];
		}
	}

}
