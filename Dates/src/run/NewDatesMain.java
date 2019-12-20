package run;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class NewDatesMain {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		
		LocalDate birth = LocalDate.of(1990, 3, 24);
//		LocalDate yearBefore = birth.minusYears(1);
//		LocalDate afterTwoWeeks = yearBefore.plusWeeks(2);
		
//		System.out.println(birth.isAfter(afterTwoWeeks));
		
//		LocalTime my = LocalTime.of(21, 2);
//		LocalTime minus5Hours = my.minusHours(5);
//		LocalTime after2Minutes = my.plusMinutes(2);
//		
//		System.out.println(my.isAfter(minus5Hours));
		
//		LocalDateTime now = LocalDateTime.now();
//		LocalDateTime idk = now.minusMinutes(5);
		
//		idk = idk.plusYears(2)
//				.plusMonths(3)
//				.minusSeconds(4)
//				.plusDays(3);
//		
//		System.out.println(idk);
//		
//		Period period = Period.of(2, 2, 1);
//		LocalDateTime idk2 = now.plus(period);
		
		DateTimeFormatter formatter = 
				DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		DateTimeFormatter formatter2 = 
				DateTimeFormatter.ofPattern("yyyy 'yaniv' MM 'avner' DD mm dd");
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2.format(formatter2));
		
		
		
		
		
	}
}
