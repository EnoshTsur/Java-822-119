package dates.run;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class NewDateMain {
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1990, 3, 24);
//		System.out.println(date);
		LocalDate now = LocalDate.now();
//		System.out.println(now);
//		System.out.println(date.getDayOfMonth());
//		System.out.println(date.getDayOfYear());
//		System.out.println(date.isLeapYear());
		LocalDate nextBirthDay = date.plusYears(30);
//		System.out.println(nextBirthDay);
		LocalDate lastBirthDay = nextBirthDay.minusYears(1);
//		System.out.println(lastBirthDay.minusMonths(5).minusYears(10));
//		System.out.println(lastBirthDay.isBefore(nextBirthDay));
		
		LocalTime someTime = LocalTime.of(18, 25);
//		System.out.println(someTime);
//		LocalTime nowTime = LocalTime.now();
//		System.out.println(nowTime);
//		LocalTime noon = LocalTime.NOON;
//		System.out.println(noon);
//		
//		System.out.println(nowTime.isAfter(noon));
//		LocalTime plus2Hours = nowTime.plusHours(2);
//		System.out.println(plus2Hours);
		
		
		LocalDateTime someDateTime = LocalDateTime.of(1996, 5, 12, 16, 32);
//		System.out.println(someDateTime);
		LocalDateTime combined = LocalDateTime.of(date, someTime);
//		System.out.println(combined);
		
		Period period = Period.of(2, 3, 4);
//		System.out.println(date.minus(period));
		
//		System.out.println(Period.between(nextBirthDay, lastBirthDay));
		
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
//		System.out.println(date.format(dateFormatter));
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
//		System.out.println(someTime.format(timeFormatter));
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy 'enosh' dd MM 'cool'");
		System.out.println(someDateTime.format(dateTimeFormatter));
	}

}
