package Run;

import java.util.Arrays;

public class ArrayObject {
	
	static void printArrays(int[] nums) {
		System.out.println(Arrays.toString(nums));
	}
	
	
	public static void main(String[] args) {
		// Declare array
		int[] intArray = new int[4];
		
		// Initial array
		for(int i = 0; i < intArray.length; i++) {
			int randomNumber = (int) (Math.random() * 10);
			intArray[i] = randomNumber;
		}
		
		// Sum array
		int sum = 0;
		for (int current : intArray) {
			sum+= current;
		}
		
		int max = 0;
		int counter = 0;
		int higherIndex = 0;
		
		for (int current : intArray) {
			if(current > max) {
				max = current;
				higherIndex = counter;
			}
			
			counter++;
		}
		
		System.out.printf("the max: %d a index %d", max, higherIndex);
		
		
		
		int[] intArray2 = {
				(int) (Math.random() * 10),
				(int) (Math.random() * 10),
				(int) (Math.random() * 10),
				(int) (Math.random() * 10)
		};
		

		
		printArrays(intArray);
		int counter2 = 0;
		for(int current: intArray) {
			int random = (int) (Math.random() * 10);
			intArray[counter2] = random;
			counter2++;
		}
	
		
		printArrays(intArray);

		
	System.out.println(Arrays.toString(intArray));
		
		
		
	}

}
