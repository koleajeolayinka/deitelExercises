package Chapter2;

import java.util.Scanner;

//2.26 (Multiples) Write an application that reads two integers, determines whether the first
//        number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
//        remainder operator.]
public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        System.out.println("WELCOME TO THE BEST APPLICATION THAT DETERMINE THE FIRST TRIPLED NUMBER IS \n A MULTIPLES OF SECOND NUMBER DOUBLED");
        System.out.println("ENTER YOU FIRST NUMBER ");
        firstNumber = scanner.nextInt();
        System.out.println("ENTER YOU SECOND NUMBER ");
        secondNumber = scanner.nextInt();

        int tripledOfFirstNumber = firstNumber * firstNumber * firstNumber;
        int doubledOfSecondNumber = secondNumber * secondNumber;

        if (tripledOfFirstNumber % doubledOfSecondNumber == 0) {
            System.out.println("THE TRIPLED OF FIRST NUMBER " + tripledOfFirstNumber + " IS A MULTIPLE OF SECOND DOUBLED NUMBER" + doubledOfSecondNumber);

        }
        else
            System.out.println("THE TRIPLED OF FIRST NUMBER " + tripledOfFirstNumber + " IS NOT A MULTIPLE OF SECOND DOUBLED NUMBER" + doubledOfSecondNumber);
    }
}

