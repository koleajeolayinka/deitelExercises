package Chapter2;

import java.util.Scanner;

//2.30 (Separating the Digits in an Integer) Write an application that inputs one number consist-
//        ing of five digits from the user, separates the number into its individual digits and prints the digits
//        separated from one another by three spaces each. For example, if the user types in the number 42339 ,
//        the program should print
//        4  2  3  3  9
//        Assume that the user enters the correct number of digits. What happens when you enter a
//        number with more than five digits? What happens when you enter a number with fewer than five
//        digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll
//        need to use both division and remainder operations to “pick off ” each digit.]
public class SeparatingDigitInAnInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Digit;
        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int forthDigit;
        int fifthDigit;
        System.out.println("WELCOME TO SEPARATING DIGIT APPLICATION ");
        System.out.println("ENTER DIGIT TO SEPARATE");
        Digit = scanner.nextInt();
        firstDigit =  Digit / 10000;
        secondDigit = (Digit % 10000) / 1000;
        thirdDigit = (Digit % 1000) /100;
        forthDigit = (Digit % 100) / 10;
        fifthDigit = (Digit % 10);
        System.out.println(firstDigit + "  " + secondDigit + "  " + thirdDigit + "  " + forthDigit + "  " + fifthDigit);
    }
}
