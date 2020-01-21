package run;

public class Street {

	private Home home;

	public Street(Home homes) {
		super();
		this.home = homes;
	}

	public Home getHomes() {
		return home;
	}

	public void setHomes(Home homes) {
		this.home = homes;
	}

	@Override
	public String toString() {
		return "Street [homes=" + home + "]";
	}
	
	
}
