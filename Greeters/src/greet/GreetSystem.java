package greet;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GreetSystem {
	
	private Set<Greeter> greeters;
	private GreetTask greetTask;
	private Thread greetThread;
	
	
	public Thread getGreetThread() {
		return greetThread;
	}

	

	public void setGreeters(Set<Greeter> greeters) {
		this.greeters = greeters;
	}



	public GreetSystem() {
		greeters = new HashSet<>();
		greeters.add(new Greeter(LocalDateTime.of(2002,  3, 3, 14, 2), "Happy joy!"));
		greeters.add(new Greeter(LocalDateTime.of(1990,  1, 3, 14, 2), "Happy Hanuca!"));
		greeters.add(new Greeter(LocalDateTime.of(1889,  1, 3, 14, 2), "Happy Haluts day!"));
		greeters.add(new Greeter(LocalDateTime.of(1980,  5, 3, 14, 2), "Happy Haluts day!"));
		
		greetTask = new GreetTask(greeters);
		greetThread = new Thread(greetTask);
		greetThread.setDaemon(true);
	}
	
	public List<Greeter> getGreeters() {
		List<Greeter> newGreeters = new ArrayList<>();
		for (Greeter greeter : greeters) {
			newGreeters.add(greeter);
		}
		Collections.sort(newGreeters);
		return newGreeters;
	}
	
	public boolean addGreet(Greeter greeter) {
		Set<Greeter> newOne = new HashSet<>(greeters);
		boolean isSuccess = newOne.add(greeter);
		setGreeters(newOne);
		greetTask.setGreeters(greeters);
		return isSuccess;		
	}
	
	

}
