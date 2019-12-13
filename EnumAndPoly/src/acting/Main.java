package acting;

public class Main {

	public static void main(String[] args) {
		
		Acting[] actors = { 
				new FunnyOne(), 
				new ActionOne(), 
				new DramaOne()
		};
		
		for (Acting acting : actors) {
			acting.humor();
		}

	}

}
