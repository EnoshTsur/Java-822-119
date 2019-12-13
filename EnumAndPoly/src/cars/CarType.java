package cars;

public enum CarType {

	TOYOTA(10_000) {
		@Override
		public String sayAboutCar() {
			return CarType.initText("Toyota", worth);
		}
	},
	
	MUSTANG(20_000) {

		@Override
		public String sayAboutCar() {
			return CarType.initText("Mustang", worth);
		}

	},
	
	RENAULT(40_000) {

		@Override
		public String sayAboutCar() {
			return CarType.initText("Renault", worth);
		}

	},
	
	NIVA(90_000) {

		@Override
		public String sayAboutCar() {
			return CarType.initText("Niva", worth);
		}

	},
	
	TESLA(1_000) {

		@Override
		public String sayAboutCar() {
			return CarType.initText("Tesla", worth);
		}

	};
	
	protected int worth;
	
	abstract String sayAboutCar();

	private CarType(int worth) {
		this.worth = worth;
	}
	private static String initText(String name, int worth) {
		return "Hi I'm " + name + ", And I'm worth: " + worth;
	}
	

	public int getWorth() {
		return worth;
	}
	
	
}
