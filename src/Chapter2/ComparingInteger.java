package Chapter2;

import java.util.Scanner;

//2. 2.16 (Comparing Integers) Write an application that asks the user to enter one integer, obtains
//        it from the user and displays whether the number and its square are greater than, equal to, not equal
//        to, or less than the number 100. Use the techniques shown in Fig. 2.15.
public class ComparingInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int compareInteger;
        int squareOfUserInput;

        System.out.println("WELCOME TO COMPARING OF INTEGERS ");
        System.out.println("ENTER INTEGER");
        userInput = scanner.nextInt();

        System.out.println("ENTER THE INTEGER YOU WANT TO COMPARE WITH");
        compareInteger = scanner.nextInt();

        squareOfUserInput = userInput * userInput;
        System.out.println("THE SQUARE OF THE INTEGER " + userInput + " IS: " + squareOfUserInput);
        System.out.println("YOU WANT TO COMPARE THE SQUARE OF THE INTEGER " + squareOfUserInput + " WITH " + compareInteger );

        if (squareOfUserInput > compareInteger) {
            System.out.println(squareOfUserInput + " IS GREATER THAN " + compareInteger );

        }
        if (squareOfUserInput == compareInteger) {
            System.out.println(squareOfUserInput + " IS EQUAL TO " + compareInteger );

        }
        if (squareOfUserInput != compareInteger) {
            System.out.println(squareOfUserInput + " IS NOT EQUAL TO " + compareInteger );

        }
        if (squareOfUserInput < compareInteger) {
            System.out.println(squareOfUserInput + " IS LESS THAN " + compareInteger );

        }

    }
}
