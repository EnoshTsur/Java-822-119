package run;

import entities.DogAttack;
import entities.Knight;
import entities.Player;
import entities.Wizard;
import entities.WizardAttack;

public class Main {

	public static void main(String[] args) {
		Player knight = new Knight();
		Player wizard = new Wizard();
		
		knight.attack();
		wizard.attack();
		
		knight.setAttack(new WizardAttack());
		knight.attack();
		knight.setAttack(new DogAttack());
		
		knight.attack();
		

		
		

	}

}
