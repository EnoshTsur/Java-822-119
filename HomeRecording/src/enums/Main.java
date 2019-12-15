package enums;

public class Main {

	public static void main(String[] args) {
		Day day = new Day(DayType.SUNDAY);
		
		for(DayType type: DayType.values()) {
			System.out.println(type);
		}
	}

}
