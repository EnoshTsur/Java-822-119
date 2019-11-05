package Run;

import java.util.Arrays;


public class ArrayObject {
	
	public static void main(String[] args) {
		int[] numArray = new int[4];
		numArray[0] = 9;
		numArray[3] = 2;
		
		System.out.println(
				Arrays.toString(numArray)
		);
		
		
		
		
		int[] numArray2 = new int[] { 1, 2, 3};
		System.out.println(Arrays.toString(numArray2));
		System.out.println(numArray2.length);
		
		for(int i = 0; i < numArray2.length; i++) {
			System.out.println(numArray2[i]);
		}
		

		boolean[] boolArray = {
				true, false, true
		};
	
		for(boolean current: boolArray) {
			System.out.println(current);
		}
		
		int[] a = {1, 54, 7, 4};
		int z = a.length;
		
		
		String[] stringArray = new String[3];
		
		System.out.println(stringArray[0].toUpperCase());
		
		
		
	}

}
