package acting;

public class Main {

	public static void main(String[] args) {
		Acting acting = new Acting() {
			
			@Override
			public void humor() {
			System.out.println("Hahaha");
			}
			
			@Override
			public void horror() {
				System.out.println("Boo! ");
			}
			
			@Override
			public void drama() {
				System.out.println("Oh no!");
			}
		};
		
		acting.humor();
		acting.horror();
		acting.drama();

	}

}
