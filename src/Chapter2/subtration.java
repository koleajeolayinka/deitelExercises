package Chapter2;

import java.util.Scanner;
public class subtration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1;
        double number2;

        System.out.println("input first number");
        number1 = sc.nextInt();

        System.out.println("input second number");
        number2 = sc.nextInt();

        double minus = number1 - number2;

        System.out.printf("%s%n first number minus second number is: ", minus);





    }
}
