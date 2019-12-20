package utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	
	public static Date initDate(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day);
		return calendar.getTime();
	}

}
