package inetr;

public class Main {

	public static void main(String[] args) {
		OtherInterface other = new OtherInterface() {

			@Override
			public void humor() {
				System.out.println("Hahaha!");
				
			}
		};
		
		other.humor();
	}

}
