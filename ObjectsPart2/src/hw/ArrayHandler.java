package hw;

import java.util.Arrays;

public class ArrayHandler {

	// Attributes, members
	public int[] array;

	/**
	 * CTR - initial array
	 * @param array
	 */
	public ArrayHandler(int[] array) {
		this.array = array;
	}

	/**
	 * CTR - initial array with random data
	 */
	public ArrayHandler() {
		int size = 10;
		array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = (int) (Math.random() * 10);
		}
	}
	
	// Methods 
	
	public int[] getDuplicates() {
		int[] tempArray = new int[array.length];
		int counter = 0;
		int temp = 0;
		
		Arrays.sort(array);
		
		boolean found = false;

		for (int i = 0; i < array.length; i++) {	
			
			if(array[temp] == array[i] ) {
				temp = i;
			}
			
			if(i > temp) {
				found = false;
			}
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] == array[j] && !found) {
					tempArray[counter] = array[j];
					found = true;
					temp = j;
					counter++;
					continue;
				}
			}
		}
		
		int[] finalArray = new int[counter];
		
		for (int i = 0; i < counter; i++) {
			finalArray[i] = tempArray[i];
		}
		
		return finalArray;
	}
	
	
	
	public int howManyIn(int[] newArray) {
		int counter = 0;
		
		// [3, 8, 5, 6] 
		// [0, 2, 3, 1, 5]
		
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(newArray[i] == array[j]) {
					counter++;
					break;
				}
			}
		}
		
		return counter;
	}
	
	
	/**
	 * Takes an int index 
	 * Split the original array into two arrays
	 * returns true if one half of the array equals the other
	 * @param index
	 * @return boolean
	 */
	public boolean isBalanced(int index) {
		if (array.length == 0) {
			return true;			
		}

		if (index > array.length || index < 0) {
			System.out.println("invalid index");
			return false;
		}

		// zero to index
		int[] part1 = new int[index];
		// index to length
		int[] part2 = new int[array.length - index];

		// copy from array
		/**
		 * src − This is the source array.
		 * 
		 * srcPos − This is the starting position in the source array.
		 * 
		 * dest − This is the destination array.
		 * 
		 * destPos − This is the starting position in the destination data.
		 * 
		 * length − This is the number of array elements to be copied
		 * 
		 */
		// index = 3
		// [1, 2, 3, 3, 3, 0] 
		// -> part1: [1, 2, 3] 
		// -> part2: [3, 3, 0]
		System.arraycopy(array, 0, part1, 0, index);
		System.arraycopy(array, index, part2, 0, array.length - index);
		
		int sum1 = 0;
		
		for (int randomNumber : part1) {
			sum1 += randomNumber;
		}
		
		int sum2 = 0;
				
		for (int randomNumber : part2) {
			sum2 += randomNumber;
		}
		return sum1 == sum2;

	}
	


}
