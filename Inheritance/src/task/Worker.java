package task;

public class Worker extends Person {

	private int xp;
	
	public Worker(String name, int id, int age, int xp) {
		super(name, id, age);
		this.xp = xp;
	}
	
	public void printWorker() {
		printBasic();
		System.out.println("XP: " + xp);
	}

}
