package Chapter2;

import java.util.Scanner;

//2.24 (Largest and Smallest Integers) Write an application that reads five integers and determines
//        and prints the largest and smallest integers in the group. Use only the programming techniques you
//        learned in this chapter.
public class LargestAndSmallestNumber {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int firstInteger;
        int secondInteger;
        int thirdInteger;
        int forthInteger;
        int fifthInteger;
        System.out.println("WELCOME TO LARGEST AND SMALLEST INTEGERS FINDER");
        System.out.println("KINDLY INPUT YOUR FIRST INTEGER");
        firstInteger = scanner.nextInt();

        System.out.println("KINDLY INPUT YOUR SECOND INTEGER");
        secondInteger = scanner.nextInt();

        System.out.println("KINDLY INPUT YOUR THIRD INTEGER");
        thirdInteger = scanner.nextInt();

        System.out.println("KINDLY INPUT YOUR FORTH INTEGER");
        forthInteger = scanner.nextInt();

        System.out.println("KINDLY INPUT YOUR fifth INTEGER");
        fifthInteger = scanner.nextInt();

        if (firstInteger > secondInteger && firstInteger > thirdInteger && firstInteger > forthInteger && firstInteger > fifthInteger ) {
            System.out.println("THE LARGEST INTEGER IS " + firstInteger);
        }
        if (secondInteger > firstInteger && secondInteger > thirdInteger && secondInteger > forthInteger && secondInteger > fifthInteger ) {
            System.out.println("THE LARGEST INTEGER IS " + secondInteger);
        }
        if (thirdInteger > secondInteger && thirdInteger > firstInteger && thirdInteger > forthInteger && thirdInteger > fifthInteger ) {
            System.out.println("THE LARGEST INTEGER IS " + thirdInteger);
        }
        if (forthInteger > secondInteger && forthInteger > thirdInteger && forthInteger > firstInteger && forthInteger > fifthInteger ) {
            System.out.println("THE LARGEST INTEGER IS " + forthInteger);
        }
        if (fifthInteger > secondInteger && fifthInteger > thirdInteger && fifthInteger > forthInteger && fifthInteger > firstInteger ) {
            System.out.println("THE LARGEST INTEGER IS " + fifthInteger);
        }


        if (firstInteger < secondInteger && firstInteger < thirdInteger && firstInteger < forthInteger && firstInteger < fifthInteger ) {
            System.out.println("THE SMALLEST INTEGER IS " + firstInteger);
        }
        if (secondInteger < firstInteger && secondInteger < thirdInteger && secondInteger < forthInteger && secondInteger < fifthInteger ) {
            System.out.println("THE SMALLEST INTEGER IS " + secondInteger);
        }
        if (thirdInteger < secondInteger && thirdInteger < firstInteger && thirdInteger < forthInteger && thirdInteger < fifthInteger ) {
            System.out.println("THE SMALLEST INTEGER IS " + thirdInteger);
        }
        if (forthInteger < secondInteger && forthInteger < thirdInteger && forthInteger < firstInteger && forthInteger < fifthInteger ) {
            System.out.println("THE SMALLEST INTEGER IS " + forthInteger);
        }
        if (fifthInteger < secondInteger && fifthInteger < thirdInteger && fifthInteger < forthInteger && fifthInteger < firstInteger ) {
            System.out.println("THE SMALLEST INTEGER IS " + fifthInteger);
        }
    }
}
