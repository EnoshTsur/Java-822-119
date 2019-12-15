package inter.greet;

public class English implements Greet {

	@Override
	public void hello() {
		System.out.println("Hello!");
	}

	@Override
	public void bye() {
		System.out.println("Bye bye!");
		
	}
	
	public void onlyEnglish() {
		
	}


}
