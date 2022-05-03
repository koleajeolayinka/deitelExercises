package Chapter2;

import java.util.Scanner;

//2.33 (Body Mass Index Calculator) We introduced the body mass index (BMI) calculator in
//        Exercise 1.10. The formulas for calculating BMI areMaking a Difference
//        119
//                    weightInPounds × 703
//         BMI =  ---------------------------------------------------------------------------------
//               heightInInches × heightInInches
//        or
//                weightInKi log rams
//        BMI = ---------------------------------------------------------------------------------------
//               heightInMeters × heightInMeters
//        Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you pre-
//        fer, the user’s weight in kilograms and height in meters), then calculates and displays the user’s
//        body mass index. Also, display the BMI categories and their values from the National Heart Lung
//        and Blood Institute
//        http://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm
//        so the user can evaluate his/her BMI.
//        [Note: In this chapter, you learned to use the int type to represent whole numbers. The BMI
//        calculations when done with int values will both produce whole-number results. In Chapter 3
//        you’ll learn to use the double type to represent numbers with decimal points. When the BMI cal-
//        culations are performed with double s, they’ll both produce numbers with decimal points—these
//        are called “floating-point” numbers.]
public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weightInPounds;
        int heightInInches;
        System.out.println("WELCOME TO BODY MASS INDEX CALCULATOR");
        System.out.println("KINDLY ENTER YOUR WEIGHT IN POUNDS");
        weightInPounds = scanner.nextInt();
        System.out.println("KINDLY ENTER YOUR HEIGHT IN INCHES");
        heightInInches = scanner.nextInt();

        int BMI = (weightInPounds * 703) / (heightInInches * heightInInches);

        System.out.println("YOUR BODY MASS INDEX IS " + BMI);
    }

}
