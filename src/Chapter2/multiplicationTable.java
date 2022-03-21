package Chapter2;


import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter a digit");
        int number = input.nextInt();

        int count = 1;
        while (count <= 12) {
            int product = number * count;
            System.out.println(number + " X " + count + " = " + product);
            count++;

        }
    }

}
