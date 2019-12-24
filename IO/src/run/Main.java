package run;

import java.io.File;

public class Main {
	

	public static void main(String[] args) {
	
		File myPath = new File("./src/run/hi.txt");
		File newFolder = new File("./src/run/shalom/");
//		System.out.printf("Is exists? %b \n", myPath.exists());
//		System.out.printf("Is File? %b \n", myPath.isFile());
		
//		System.out.printf("Is Directory? %b \n", myPath.isDirectory());
//		System.out.println(myPath.getParent());
//		System.out.println(myPath.getTotalSpace());
		
		if(newFolder.exists() && newFolder.isDirectory()) {
			newFolder.delete();
		} else {
			newFolder.mkdir();
		}
	}
}
