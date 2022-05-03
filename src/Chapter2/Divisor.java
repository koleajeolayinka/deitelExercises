package Chapter2;

import java.util.Scanner;

//    2.25 (Divisible by 3) Write an application that reads an integer and determines and prints
//    whether it’s divisible by any number or not. [Hint: Use the remainder operator. A number is divisible by 3 if
//    it’s divided by 3 with a remainder of 0.]
public class Divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Dividend;
        int number;
        System.out.println("WELCOME TO THE BEST APP THAT CHECK ANY NUMBER THAT IS DIVISIBLE BY ANY NUMBER OF YOUR CHOICE");
        System.out.println("ENTER A DIVIDEND NUMBER");
        Dividend = scanner.nextInt();
        System.out.println("ENTER ANY NUMBER TO CHECK IF IT'S DIVISIBLE BY " + Dividend);
        number = scanner.nextInt();


        if(number % Dividend == 0){
            System.out.println(number + " IS DIVISIBLE BY " + Dividend);
        }
        else
            System.out.println("NOT DIVISIBLE");

    }
}
