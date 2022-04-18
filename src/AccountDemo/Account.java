package AccountDemo;

public class Account {
    private final String accountNumber;

    private final String accountName;
    public String getaccountName;
    private int balance;
    private String pin;
    private int Balance;


    public Account(String accountNumber, String firstName, String lastName, String pin) {
        this.accountNumber = accountNumber;
        this.accountName = firstName + " " + lastName;
        this.pin = pin;
        this.Balance = balance;
        this.getaccountName = accountName;
    }

    public String getaccountNumber() {
        return accountNumber;

    }

    public String getaccountName() {
        return accountName;
    }


    public void deposit(int amount) {
        balance = balance + amount;
    }

    public int getAccountBalance(String pin) {
        if (pin == this.pin) return balance;
        return 0;
    }


    public int getBalance(int i) {
        return Balance;
    }
}

