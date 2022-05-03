package Chapter2;

import java.util.Scanner;

//2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
//        user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
//        shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
//        representation of the average. So, if the sum of the values is 7, the average should be 2, not
//        2.3333….]
public class ArithmeticSmallestAndLargestFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInteger;
        int secondInteger;
        int thirdInteger;
        System.out.println("WELCOME TO ARITHMETIC, SMALLEST AND LARGEST FINDER ");
        System.out.println("ENTER FIRST INTEGER");
        firstInteger = scanner.nextInt();
        System.out.println("ENTER SECOND INTEGER");
        secondInteger = scanner.nextInt();
        System.out.println("ENTER THIRD INTEGER");
        thirdInteger = scanner.nextInt();

        int sum = firstInteger + secondInteger + thirdInteger;
        int average = sum / 3;
        int product = firstInteger * secondInteger * thirdInteger;
        System.out.println("THE SUM OF THE INTEGER " + firstInteger + ", " + secondInteger + " AND " + thirdInteger + " IS " + sum);
        System.out.println("THE AVERAGE OF THE INTEGER " + firstInteger + ", " + secondInteger + " AND " + thirdInteger + " IS " + average);
        System.out.println("THE PRODUCT OF THE INTEGER " + firstInteger + ", " + secondInteger + " AND " + thirdInteger + " IS " + product);

        if (firstInteger > secondInteger && firstInteger > thirdInteger) {
            System.out.println("THE LARGEST INTEGER IS " + firstInteger);

        }

        if (secondInteger > firstInteger && secondInteger > thirdInteger) {
            System.out.println("THE LARGEST INTEGER IS " + secondInteger);

        }

        if (thirdInteger > secondInteger && thirdInteger > firstInteger) {
            System.out.println("THE LARGEST INTEGER IS " + thirdInteger);

        }

        if (firstInteger < secondInteger && firstInteger < thirdInteger) {
            System.out.println("THE SMALLEST INTEGER IS " + firstInteger);

        }

        if (secondInteger < firstInteger && secondInteger < thirdInteger) {
            System.out.println("THE SMALLEST INTEGER IS " + secondInteger);

        }

        if (thirdInteger < secondInteger && thirdInteger < firstInteger) {
            System.out.println("THE LARGEST INTEGER IS " + thirdInteger);

        }

    }
}
