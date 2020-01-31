package singleton;

public class Main {

	public static void main(String[] args) {
		Bank bank = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		System.out.println(bank == bank2);
	}
}
