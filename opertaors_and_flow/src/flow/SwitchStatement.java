package flow;

public class SwitchStatement {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 20) + 1;

		/**
		 * Random Age between 10 - 60 
		 * if age == 18: "18 message' 
		 * if age between 19 - 21 : "19-21 message"
		 * if age  == 24 : "24 message"
		 * else: "else message"
		 */

		number = 5;

		switch (number) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("4 - 8");
			break;
		case 15:
			System.out.println("15");
			break;
		default:
			System.out.println("defalut");

		}
	}

}
