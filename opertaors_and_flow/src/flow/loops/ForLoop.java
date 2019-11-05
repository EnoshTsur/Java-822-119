package flow.loops;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// define index inside a for loop
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		
		
		// nested for loops
		for(int i = 0; i < 10; i++) {
			
			for(int j = 0; j < 10; j++) {
				System.out.printf("I: %d\nJ: %d\n", i, j);
			}
		}
		
		
		

	}

}
