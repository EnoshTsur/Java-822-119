package orch;

public class Main {

	public static void main(String[] args) {

		
		Musician guitar = new GuitarPlayer();
		Musician piano = new PianoPlayer();
		
		guitar.play();
		piano.play();
		
		guitar.setPlaying(new Piano());
		guitar.play();
		
		piano.setPlaying(new Guitar());
		piano.play();
		

	}

}
