package AccountDemo;

public class Account {
    private final String accountNumber;

    private final String accountName;
    public String getaccountName;
    private int balance;


    public Account(String accountNumber, String firstName, String lastName, String pin) {
        this.accountNumber = accountNumber;
        this.accountName = firstName + " " +lastName ;
    }

    public String getaccountNumber() {
        return accountNumber;

    }

    public String getaccountName() {
        return accountName;
    }


    public void deposit(String s) {
        int amount = 0;
        this.balance = balance + amount;
    }

    public void getaccountDeposit (int amount) {
        balance += amount;

    }

    public int getaccountBalance() {
        if(pin.equals(this.pin)) return balance;
    }

}

