package entry;

import entities.Account;
import entities.Client;
import utils.Rank;

public class Main {

    public static void main(String[] args) {
    	Client c = new Client("Avi", Rank.GOLD, 398.99);
    	c.addAccount(new Account(100));
    	c.addAccount(new Account(200));
    	c.addAccount(new Account(300));
    	c.addAccount(new Account(400));
    	c.removeAccount(1);
    	c.addAccount(new Account(99));
    	System.out.println(c);
    	
    	
    }
}
