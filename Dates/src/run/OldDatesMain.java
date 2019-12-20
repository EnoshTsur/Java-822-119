package run;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class OldDatesMain {

	public static void main(String[] args) {
		Date date = DateUtils.initDate(1990, Calendar.MARCH, 24);
		Date date2 = DateUtils.initDate(1992, Calendar.APRIL, 24);
		
		if(date.before(date2)) {
			System.out.println("Enosh cool!!");
		}

	}
	


}
