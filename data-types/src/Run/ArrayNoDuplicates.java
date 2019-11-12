package Run;

import java.util.Arrays;

public class ArrayNoDuplicates {

	public static void main(String[] args) {
		/**
		 * 3. Create a class that eliminates duplications. 
		 * The class should be capable of getting an array with duplicated values 
		 * And return an array of unique values generated from it. 
		 * For example, for the input {1,2,5,1,6,1,5,4,8} the
		 * result should be {1,2,5,6,4,8}  
		 * 		
		 * 		1) create an array[10] of numbers with random values between 0-10  
		 * 		2) create an array with the required size to host the
		 * 		   unique values 
		 * 		3) fill the unique array  
		 * 		4) print both arrays
		 */

		// Declare
		int[] numArray = new int[10];

		// Initial
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = (int) (Math.random() * 10) + 1;
		}

		// Print
		System.out.println(Arrays.toString(numArray));
		
		// [2, 3, 5, 0]
		// [2, 3, 5]

		// Sort the array
		for (int i = 0; i < numArray.length; i++) {
			for (int j = i + 1; j < numArray.length; j++) {
				if (numArray[i] > numArray[j]) {
					int temp = numArray[j];
					numArray[j] = numArray[i];
					numArray[i] = temp;
				}
			}
		}

		// Create a new array with unique values
		int[] unique = new int[numArray.length];

		int prev = numArray[0];
		unique[0] = prev;

		int count = 1;
		for (int i = 1; i < numArray.length; ++i) {
			if (numArray[i] != prev) {
				unique[count] = numArray[i];
				count++;
			}
			prev = numArray[i];
		}

		// unique
		System.out.println(Arrays.toString(unique));

		int[] finalArray = new int[count];
		System.arraycopy(unique, 0, finalArray, 0, count);

		System.out.println(Arrays.toString(finalArray));

		int[] noDuplicates = Arrays.stream(numArray)
	            .distinct()
	            .toArray();
		
		System.out.println(Arrays.toString(noDuplicates));

	}

}
