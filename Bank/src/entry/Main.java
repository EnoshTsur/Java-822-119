package entry;

import entities.Account;
import entities.Client;

public class Main {

    public static void main(String[] args) {
    	Client client = new Client("Itsik");
    	
    	client.addAccount(new Account(100));
    	client.addAccount(new Account(100));
    	client.addAccount(new Account(100));
    	client.addAccount(new Account(100));
    	client.addAccount(new Account(100));
    	
    }
}
