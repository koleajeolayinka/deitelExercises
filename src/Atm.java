import AccountDemo.Account;
import AccountDemo.Bank;

import java.util.Scanner;

public class Atm {
    private static Scanner scanner = new Scanner(System.in);
    public static Bank Zubank  = new Bank("Zuber", 20 );
    public static void main(String[] args) {
        runApp();

    }


    public static void runApp(){
        String prompt = """
                welcome
                press softly
                1 --> To create account
                2 --> To deposit
                3 --> to withdraw
                4 --> to transfer
                5 --> to check balance.
                6 --> to exit
                """;
        System.out.println(prompt);
        int userResponse =scanner.nextInt();
                switch (userResponse){
                    case 1: createAccount();
                    break;
                    case 2: putMoney();
                    break;
                    case 3: withdraw();
                    break;
                    case 4: urgent2k();
                    break;
                    case 5: shakebalance();
                    break;
                    case 6: exit ();
                    break;
                    default:
                        runApp();


                }
    }

    private static void exit() {

    }

    private static void shakebalance() {
        System.out.println("WETIN BE UR ACCOUNT NUMBER BIKO?");

    }

    private static void urgent2k() {
        System.out.println("WETIN BE UR ACCOUNT BALANCE BIKO?  ");
        String senderAccountNumber = scanner.nextLine();
        System.out.println("BEBE'S ACCOUNT NUMBER");
        String receiverAccountNumber = scanner.nextLine();
        System.out.println("ya needle?");
        String pin = scanner.next();
        System.out.println("HOW MUCH?");
        int amount = scanner.nextInt();
        Zubank.transfer(amount, senderAccountNumber, receiverAccountNumber, pin);
        Account fromAccount = Zubank.findAccount(Integer.parseInt((senderAccountNumber)));

        System.out.println("New balance is " + fromAccount.getBalance(Integer.parseInt(pin)));
        scanner.next();
        runApp();

    }

    private static void withdraw() {
    }

    private static void putMoney() {
        System.out.println("which Account?");
        String accountNumber = scanner.nextLine();
        Account account = Zubank.findAccount(Integer.parseInt((accountNumber)));
        System.out.println("THE ACCOUNT NAME IS " + account.getaccountName());
        System.out.println("HOW MUCH?");
        int amount = scanner.nextInt();



    }

    private static void createAccount() {
        System.out.println("Enter your real name");
        String firstName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("enter your papa name");
        String lastName = scanner.nextLine();
        System.out.println("WEy needle");
        String pin = scanner.nextLine();
        System.out.println();
        System.out.println();
        Account savedAccount = Zubank.createAccountFor("firstName", "lastName", "pin");
        System.out.println(savedAccount);
        System.out.println();
        System.out.println();
        runApp();
    }
}

