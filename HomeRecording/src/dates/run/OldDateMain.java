package dates.run;

import java.util.Calendar;
import java.util.Date;

public class OldDateMain {

	public static void main(String[] args) {
		Date now = new Date();
//		System.out.println(now);
		Date idk = new Date(1232454567587L);
//		System.out.println(idk);
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(1990, Calendar.MARCH, 24);
		Date birthDate = calendar.getTime();
		System.out.println(birthDate);

	}

}
