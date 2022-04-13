package workSpace;

import java.util.Scanner;

public class NumeratorAndDenumerator {
    public static void main(String[] args) {
        Scanner nd = new Scanner(System.in);
        int count = 0;
        System.out.println("ENTER NUMERATOR");
        int numerator = nd.nextInt();

        System.out.println("ENTER DENUMERATOR");
        int denumerator = nd.nextInt();

        for (int i = 0; i != -1; i++) {
            ++count;
            numerator = numerator - denumerator;
            if (numerator == 0) {
                break;
            }
        }
        System.out.println(count);
    }
}
