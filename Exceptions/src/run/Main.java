package run;

import exceptions.GreenColorException;
import exceptions.NoMaorException;

public class Main {

	public static void main(String[] args)  {
	
//		try {
//			invalidAge(7);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		try {
			noMaor("maor");
		} catch (NoMaorException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void noMaor(String friend) throws NoMaorException { // עלול להכשל
		
		if (friend.equals("maor")) {
			throw new NoMaorException("No Maor!!!!!"); // אני מכשיל כי מאור לא טוב
		}
	}
	
	public static void invalidAge(int age) throws GreenColorException {
		if(age < 18) {
			throw new GreenColorException("I dont like green color");
		}
	}
}
