package Chapter2;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("enter your first digit");
        int number1 = scanner.nextInt();


        System.out.println("enter your second digit");
        int number2 = scanner.nextInt();

        System.out.println("enter your thrid digit");
        int number3 = scanner.nextInt();
       int sum = number1 + number2 + number3;
        System.out.printf("sum is %d%n", sum);

    }
}
