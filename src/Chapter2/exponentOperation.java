package Chapter2;

import java.util.Scanner;

public class exponentOperation {
    public static void main(String[] args) {
        Scanner eo = new Scanner(System.in);

        System.out.println("WELCOME TO EXPONENT OPERATIONS");
        System.out.println("input input your first integer\n ");
        double number1 =eo.nextDouble();

        System.out.println("input your second integer\n ");
        double number2 =eo.nextDouble();

        System.out.println("since you input " + number1 + " and " + number2 + " your answer is ");
        System.out.println(Math.pow(number1, number2));
       //System.out.println(3 + 4 * 4 + 5 * (4 + 3) -1);
    }
}
