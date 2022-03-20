package Chapter5;

import java.util.Scanner;

public class p5_16 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        num = 1-30;

        for (int i=0; i<5; i++)// system asks for no more than 5 numbers
        {
            System.out.printf("Enter a number: ");
            num = input.nextInt();
        }
        for (int j=0; j<num; j++)
        {
            System.out.printf("*");


        }
        System.out.println();

    }
}
