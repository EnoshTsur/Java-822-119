package Run;

import java.util.Arrays;

public class MatrixArrays {

	public static void main(String[] args) {
		
		
		int[][] matrix = new int[2][3];
		
		int[][] matrix2 = { 
				{2, 4, 6},
				{3, 4, 7},
				{1, 4, 6, 8, 0}
		};
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int random = (int)(Math.random() * 10);
				matrix[i][j] = random;
			}
		}
		
		for (int[] array : matrix2) {
			System.out.println(Arrays.toString(array));
		}
		
	}

}
