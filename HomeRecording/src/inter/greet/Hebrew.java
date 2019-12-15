package inter.greet;

public class Hebrew implements Greet{

	@Override
	public void hello() {
		System.out.println("Shalom ");
		
	}

	@Override
	public void bye() {
		System.out.println("Lehitraot");
		
	}
	

}
