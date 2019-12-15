package inter.runner;

import inter.greet.Greet;

public class Main {

	public static void main(String[] args) {
		
		
		Greet greeter = new Greet() {
			
			@Override
			public void hello() {
				System.out.println("Hello from greeter");
				
			}
			
			@Override
			public void bye() {
				// TODO Auto-generated method stub
				
			}
		};
		
		greeter.hello();
		
	}

}
