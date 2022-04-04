package AccountDemo;

public class Account {
    private final String accountNumber;

    private final String accountName;
    public String getaccountName;
    private int balance;
    private int pin;


    public Account(String accountNumber, String firstName, String lastName, int pin) {
        this.accountNumber = accountNumber;
        this.accountName = firstName + " " +lastName ;
        this.pin = pin;
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

    public int getAccountBalance(int pin) {
        if(pin == this.pin) return balance;
        return 0;
    }


}

