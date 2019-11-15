package Run;

import java.util.Arrays;

public class MatrixExercise {

	public static void main(String[] args) {
	
		int[][] students = new int[20][10];
		
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students[i].length; j++) {
				students[i][j] = (int) (Math.random() * 101);
			}
		}

		for (int i = 0; i < students.length; i++) {
			System.out.println(Arrays.toString(students[i]));
		}
		
		int sumClass = 0;
		for (int[] student : students) {
			int sum = 0;
			
			for (int grade : student) {
				sum += grade;
			}
			
			sumClass += sum;
			System.out.printf("The avg: %d\n", sum / student.length);
			
			
		}
		
		System.out.println("-------------------------------");
		System.out.printf(
				"The class avg: %d\n", 
				sumClass / (students[0].length * students.length)
		);

	}

}
