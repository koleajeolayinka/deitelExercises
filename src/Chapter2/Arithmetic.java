package Chapter2;

import java.util.Scanner;

//2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them from
//        the user and prints the square of each, the sum of their squares, and the difference of the squares (first
//        number squared minus the second number squared). Use the techniques shown in Fig. 2.7
public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInteger;
        int secondInteger;
        int SquareOfFirstInteger;
        int SquareOfSecondInteger;
        int SumOfTheirSquares;
        int DifferenceOfTheirSquares;
        System.out.println("WELCOME TO ARITHMETIC APPLICATION ");
        System.out.println("KINDLY ENTER YOUR FIRST INTEGER ");
        firstInteger = scanner.nextInt();

        System.out.println("KINDLY ENTER YOUR SECOND INTEGER ");
        secondInteger = scanner.nextInt();

        SquareOfFirstInteger = firstInteger * firstInteger;
        SquareOfSecondInteger = secondInteger * secondInteger;
        SumOfTheirSquares = SquareOfFirstInteger + SquareOfSecondInteger;
        DifferenceOfTheirSquares = SquareOfFirstInteger - SquareOfSecondInteger;

        System.out.printf("%nTHE SQUARE OF THE FIRST INTEGER IS: %d ", SquareOfFirstInteger);
        System.out.printf("%nTHE SQUARE OF THE SECOND INTEGER IS: %d ", SquareOfSecondInteger);
        System.out.printf("%nTHE SUM OF THEIR SQUARE IS : %d ", SumOfTheirSquares);
        System.out.printf("%nTHE DIFFERENCE OF THEIR SQUARE IS : %d ", DifferenceOfTheirSquares);

    }

}
