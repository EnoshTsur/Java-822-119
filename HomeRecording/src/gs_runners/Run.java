package gs_runners;

import java.util.Arrays;

import gs_objects.Zoo;

public class Run {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("");
		zoo.setMyAnimal(null);
		zoo.setMyAnimal("Fufu");
		System.out.println("myAnimal: " + zoo.getMyAnimal());
		System.out.println(Arrays.toString(zoo.getAnimals()));
	}
}
