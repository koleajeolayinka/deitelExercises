package AccountDemo;

public class Bank {
    private final String Name;
    private  Account[] accounts;
    private String lastName;
    private String firstName;
    private String pin;
    private int numberOfCustomer;

    public Bank(String bankName, int numberOfCustomer) {
        this.Name=bankName;
        accounts = new Account [numberOfCustomer];
    }

    public String getName() {

        return Name;
    }

    public int getMaximumNumberOfCustomer() {
        return accounts.length;
    }

    public Account createAccountFor(String lastName, String firstName, String pin) {
        this.lastName =lastName;
        this.firstName = firstName;
        this.pin = pin;
        return null;
    }
    

    public void deposit(int amount, String accountNumber) {
        Account account = findAccount((Integer.parseInt(accountNumber)));
        account.deposit(amount);

    }

    public Account findAccount(int accountNumber) {
     int indexAccount = accountNumber -1;
return accounts[indexAccount];
    }

    public int getNumberOfCustomer() {
        int NumberOfDocuments = 0;
        return NumberOfDocuments;
    }

    public void transfer(int amount, String accountNumber) {

    }

    public void transfer(int amount, String senderAccountNumber, String receiverAccountNumber, String pin) {
    }
}
