package entities;

import utils.IdGenerator;

public class Account {

    private final long ID;
    private double balance;


    public Account(double balance) {   	
        this.ID = IdGenerator.generateAcoountID();
        this.balance = balance;
    }

    public Account(){
        this(0);
    }

    public long getID() {
        return ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

	@Override
	public String toString() {
		return "Account [ID=" + ID + ", balance=" + balance + "]";
	}

	

   
}
