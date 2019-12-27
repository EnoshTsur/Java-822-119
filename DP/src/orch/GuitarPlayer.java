package orch;

public class GuitarPlayer extends Musician {

	public GuitarPlayer() {
		playingStrategy = new Guitar();
	}

	@Override
	public void play() {
		System.out.print("Guitar: ");
		playingStrategy.run();
		
	}
}
