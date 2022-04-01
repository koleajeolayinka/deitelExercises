package Chapter2;
import java.util.Scanner;
public class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER FIRST NUMBER");
        int number1 = scanner.nextInt();


        System.out.println("ENTER SECOND NUMBER");
        int number2 = scanner.nextInt();

        if (number1 == number2){
            System.out.printf("%d == %d%n", number1, number2);
    }

     //   System.exit(1);

        if(number1 != number2){
        System.out.printf("%d != %d%n", number1, number2);
    }
       // System.exit(0);

        if(number1 < number2) {
            System.out.printf("%d < %d%n", number1, number2);
        }

        if(number1 > number2) {
            System.out.printf("%d > %d%n", number1, number2);
        }

        if(number1 <= number2) {
            System.out.printf("%d <= %d%n", number1, number2);
        }
        //Math.PI STATIC VARIABLE
        if(number1 >= number2) {
            System.out.printf("%d >= %d%n", number1, number2);
        }
    }
}
