package orch;

public class PianoPlayer extends Musician {

	public PianoPlayer() {
		playingStrategy = new Piano();
	}

	@Override
	public void play() {
		System.out.print("Piano: ");
		playingStrategy.run();
		
	}
}
