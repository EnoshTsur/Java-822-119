package entities;

import utils.IdGenerator;
import utils.Rank;

public class Client {

    private final long ID;
    private String rank;
    private String name;
    private double balance;
    private Account[] accounts;
    private double commissionRate;
    private double interestRate;

    private static final int MAX_ACCOUNTS = 4;

    public Client(String name, String rank, double balance) {
        this.ID = IdGenerator.generateClientID();
        this.name = name;
        this.rank = rank;
        this.balance = balance;
        this.accounts = new Account[MAX_ACCOUNTS];
    }

    public Client(String name, String rank) {
        this(name, rank, 0);
    }

    public Client(String name) {
        this(name, Rank.REGULAR);
    }

    public double getFortune() {
        double sum = balance;
        for (Account account : accounts) {
        	if(account != null) {
        		sum += account.getBalance();        		
        	}
        }
        return sum;
    }

    private static boolean isValidIndex(int index) {
        return (index >= 0 && index < MAX_ACCOUNTS);
    }

    public void addAccount(Account account) {
        boolean canAdd = false;
        int addIndex = 0;

        for (int i = 0; i < MAX_ACCOUNTS; i++) {
            if (accounts[i] == null) {
                canAdd = true;
                addIndex = i;
                break;
            }
        }
        if (!canAdd) {
            System.out.println("There is no space for another account");
            return;
        }
        accounts[addIndex] = account;

    }

    public void removeAccount(int index) {
        if(!isValidIndex(index)) {
            System.out.printf(
                    "Invalid index: %d\n" +
                    "Index should be in range (0 - %d)\n",
                    index, (MAX_ACCOUNTS - 1)
            );
            return;
        }
        Account accountToRemove = accounts[index];
        if (accountToRemove == null) {
            System.out.printf(
                    "There is no Account at index %d\n",
                    index
            );
            return;
        }
        setBalance(getBalance() + accountToRemove.getBalance());
        accounts[index] = null;

    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public String accountsToString(){
        String accountsString = "\naccounts: [\n";
        for (Account account: accounts){
            accountsString += account + "\n";
        }
        accountsString += "]\n";
        return accountsString;
    }

    @Override
    public String toString() {
        return "Client{" +
                "ID=" + ID +
                ", rank='" + rank + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                accountsToString() +
                ", commissionRate=" + commissionRate +
                ", interestRate=" + interestRate +
                '}';
    }
}