package Chapter5;

import java.util.Scanner;

public class page5_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number ");
        int num1 = input.nextInt();

        System.out.println("Enter second number ");
        int num2 = input.nextInt();

        System.out.println("Enter third number ");
        int num3 = input.nextInt();

        System.out.println("Enter fourth number ");
        int num4 = input.nextInt();
        System.out.println("Enter fifth number ");
        int num5 = input.nextInt();

        barChartShape(num1);
        barChartShape(num2);
        barChartShape(num3);
        barChartShape(num4);
        barChartShape(num5);

    }

    private static void barChartShape(int number){
        for (int i = 1; i <= number; i++){
            if (number > 0 && number <= 30){
                System.out.print("* ");
            }
        }
        System.out.println();

    }
}
