package flow;

public class NestedIf {

	public static void main(String[] args) {
		String name = "avi";
		int age = 28;
		
		if(age == 18) {
			
			if(name.equals("avi")) {
				System.out.println("Avi is 18 y o");
			} else if (name.equals("avner")) {
				System.out.println("Avner is 18 y o");
			}
			
		} else {
			if (name.startsWith("A")) {
				System.out.println("Starts with A");
			}
		}

	}

}
