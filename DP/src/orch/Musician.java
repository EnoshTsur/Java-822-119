package orch;

public abstract class Musician {

	protected Runnable playingStrategy;
	
	public abstract void play();

	public void setPlaying(Runnable playing) {
		this.playingStrategy = playing;
	}
	
	
}
