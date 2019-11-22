package exam;

import java.util.Scanner;

public class ExamSolution {
	
	public static void main(String[] args) {
		char[] colors = { 'Y', 'B', 'G', 'R', 'O' };
		char[] toGuess = new char[3];

		boolean exist = false;
		int pos = 0;
		do {
			char color = colors[(int) (Math.random() * 5)];
			exist = false;
			for (int j = 0; j < pos; j++) {
				if (toGuess[j] == color) {
					exist = true;
				}
			}
			if (!exist) {
				toGuess[pos] = color;
				pos++;
				break;
			}
		} while (pos < toGuess.length);

		int counter = 0;
		int success = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			// user guess
			System.out.println("Please enter your guess:   (Y/B/G/R/O)");
//			System.out.println("first color: ");
//			char c1 = scanner.next().charAt(0);
//			System.out.println("second color: ");
//			char c2 = scanner.next().charAt(0);
//			System.out.println("third color: ");
//			char c3 = scanner.next().charAt(0);
			char userGuess[] = new char[3];
			char results[] = new char[3];
			
			
			for (int i = 0; i < userGuess.length; i++) {
				System.out.printf("%d) color: \n");
				char guess = scanner.next().charAt(0);
				
				if (guess == 'X') {
				System.out.println("You choose to quit");
				System.exit(0);				
				}
				
				userGuess[i] = guess;
			}
//			
//			//quit check
//			if(c1=='X'||c2=='X'||c3=='X') {
//			}
			// check
			success = 0;
			for (int i = 0; i < userGuess.length; i++) {
				if (toGuess[i] == userGuess[i]) {
					results[i] = 'X';
					success++;
				} else {
					boolean found = false;
					for (int j = 0; j < toGuess.length; j++) {
						if (userGuess[i] == toGuess[j]) {
							found = true;
							break;
						}
					}
					if (found) {
						results[i] = 'O';
					} else {
						results[i] = '_';
					}
				}
			}
			System.out.println("results: " + results[0] + "," + results[1] + "," + results[2]);
			counter++;
		} while (success < 3);

		System.out.println("You made it ! Took you " + (counter) + " Guesses");
	}

}
