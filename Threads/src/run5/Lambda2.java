package run5;

import java.util.function.Function;

public class Lambda2 {

	public static void main(String[] args) {

		
//		Function<Integer, Integer> newOne = add(2);
//		
//		System.out.println(newOne.apply(4));
		Function<String, String>gretAvi = massage("Avi");
		System.out.println(gretAvi.apply("hey"));

	}

	public static Function<Integer, Integer> add(int toAdd) {
		return (num2) -> {
			
			return toAdd + num2;
		};
	}
	public static Function<String,String> massage(String name){
		return (gret)-> {
			return name +" "+ gret; 
		};
	}

}


