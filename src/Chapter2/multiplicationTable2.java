package Chapter2;

import java.util.Scanner;

public class multiplicationTable2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO AUTOMATIC SUM OF NUMBER DIGIT YOU ENTER");
        System.out.println(" enter 4 number");
        int sumNumber4 = scanner.nextInt();

        int totalNumber = sumNumber4 / 1000;
        sumNumber4 = totalNumber * 4;
        System.out.println(sumNumber4);

        System.out.println("WELCOME TO AUTOMATIC SUM OF NUMBER DIGIT YOU ENTER");
        System.out.println(" enter 3 number");
        int sumNumber3 = scanner.nextInt();
        int nu0 = sumNumber3 / 100;
        sumNumber3 = nu0 * 4;
        System.out.println(sumNumber3);

        System.out.println("WELCOME TO AUTOMATIC SUM OF NUMBER DIGIT YOU ENTER");
        System.out.println(" enter 2 number");
        int sumNumber2 = scanner.nextInt();
           int  nu2 = sumNumber2 / 10;
            sumNumber2 = nu2 * 2;
            System.out.println(sumNumber2);

        System.out.println("WELCOME TO AUTOMATIC SUM OF NUMBER DIGIT YOU ENTER");
        System.out.println(" enter 1 number");
        int sumNumber = scanner.nextInt();
            int nu1 = sumNumber;
            sumNumber = nu1;
        System.out.println(sumNumber);

        }

    }


