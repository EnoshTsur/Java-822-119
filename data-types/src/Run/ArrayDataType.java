package Run;

import java.util.Arrays;

public class ArrayDataType {

	public static void main(String[] args) {
		
		int[] intArray = new int[4];
		intArray[0] = 9;
		
		System.out.println(intArray[intArray.length - 1]);
		System.out.println(Arrays.toString(intArray));
		
		double[] doubArray = new double[4];
		System.out.println(Arrays.toString(doubArray));
		
		float[] floatArray = new float[4];
		System.out.println(Arrays.toString(floatArray));
		
		char[] charArray = new char[4];
		System.out.println(Arrays.toString(charArray));
		
		boolean[] boolArray = new boolean[4];
		System.out.println(Arrays.toString(boolArray));
		
		String[] strArray = new String[4];
		System.out.println(Arrays.toString(strArray));
		
		
		
	
		
		int[] numArray = {
				23, 13, 8, 14, 7
		};
		
		System.out.println(numArray[0]);
		
		for (int i = 0; i < numArray.length; i++) {
			System.out.printf("num: %d at index %d\n", numArray[i], i);
		}
		
		for (int num : numArray) {
			System.out.printf("Current number is %d\n", num);
		}
		
		
		
		String[] friends = { "Maor", " ", "Itay", "  ", "", "Liat" };
		
		for (int i = 0; i < friends.length; i++) {
			if (friends[i].trim().isEmpty()) {
				friends[i] = "Avner";
			}
		}
		
		friends[friends.length - 2] = "Yoshiuyuki";
		System.out.println(Arrays.toString(friends));
		
		
	}

}
