package greet;

import java.time.LocalDateTime;
import java.util.Set;

public class GreetTask implements Runnable{
	
	private Set<Greeter> greeters;

	public GreetTask(Set<Greeter> greeters) {
		this.greeters = greeters;
	}

	private boolean isThisMonth(LocalDateTime current) {
		return current.getMonth().equals(LocalDateTime.now().getMonth());
	}
	
	public Set<Greeter> getGreeters() {
		return greeters;
	}

	public void setGreeters(Set<Greeter> greeters) {
		this.greeters = greeters;
	}

	@Override
	public void run() {
		
		while(true) {	
			for (Greeter greeter : greeters) {
				if(isThisMonth(greeter.getBirthDate()) && !greeter.isSeen()) {
					System.out.println(greeter.getMessage());
					greeter.setSeen(true);
				}
			}
		}
		
	}
	
	
	
	

}
