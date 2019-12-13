package cars;

public class Car {
	
	private CarType type;
	
	private int defaultWorth = 0;

	public Car(CarType type) {
		this.type = type;
	}

	public int getWorth() {
		switch(type) {
		case MUSTANG:
			return 80_000;
			
		case NIVA:
			return 100_000;
			
		case RENAULT:
			return 70_000;
			
		case TESLA:
			return 120_000;
			
		case TOYOTA:
			return 300_000;
		}
		
		return defaultWorth;
	}
	

}
