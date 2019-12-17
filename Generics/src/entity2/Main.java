package entity2;

public class Main {

	public static void main(String[] args) {
		
		Pair<Player, Enemy> pair =
				new Pair<>(
						new Player("Avi", 40),
						new Enemy("Aston", 32)
		);
		
//		pair.printBoth();
		
		pair.getE().talk();
		
		
	}
}
