package Chapter2;
import java.util.Scanner;

public class separatingTheDigitInAnInteger {
    public static void main(String [] args){
        Scanner separatingTechnique = new Scanner (System.in);
       System.out.println("enter five digit number");
        int number = separatingTechnique.nextInt();

        int firstDigit = number/10000;
        int secondDigit = (number % 10000)/ 1000;
        int thirdDigit = (number % 1000)/100;
        int forthDigit = (number %100)/10;
        int fifthDigit = (number % 10);
        System.out.printf("the number are %d %d %d %d %d%n", firstDigit,secondDigit,thirdDigit,forthDigit,fifthDigit);


    }
}
