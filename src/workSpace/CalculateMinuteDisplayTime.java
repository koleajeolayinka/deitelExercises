package workSpace;

import java.util.Scanner;
//obtains minutes and remaining seconds from an amount of time
//in seconds. For example, 500 seconds contains 8 minutes and 20 seconds.
public class CalculateMinuteDisplayTime {
    public static void main(String[] args) {

        Scanner time = new Scanner(System.in);

        System.out.println("Enter an integer for seconds: ");
        int seconds =time.nextInt();

        int minute = seconds / 60;
        int remainingSecond = seconds % 60;

        System.out.println(seconds + " seconds is " + minute + " minutes and " + remainingSecond + " seconds");
    }
}
