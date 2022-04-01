package testCode;


import java.util.Scanner;
public class EnumDemo {
//    Define the enum type -- remember that the definitions
//    go OUTSIDE THE main() routine!
    enum Day { SUNDAY, MONDAY, TUESDAY,WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

    enum Month { JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, OCT, DECEMBER}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day tgif;
        Month Aries;
// Declare a variable of type Day.
// Declare a variable of type Month.
        tgif = Day.FRIDAY;
        Aries = Month.APRIL;
// Assign a value of type Day to tgif.
// Assign a value of type Month to libra.
        System.out.print("My sign is Aries, since I was born in ");

        System.out.println(Aries);
// Output value will be: OCT
        System.out.print("That’s the ");
        System.out.print( Aries.ordinal() );
        System.out.println("-th month of the year.");
        System.out.println(" (Counting from 0, of course!)");
        System.out.print("Isn’t it nice to get to ");
        System.out.println(tgif);
// Output value will be: FRIDAY
        System.out.println( tgif + " is the " + tgif.ordinal()
                + "-th day of the week.");
        System.out.println( tgif +" is the");
        String unknown = sc.next();
        String x = "hello";
        String y = unknown;
        if( x != y) {
            System.out.print(x);

        }

    }
}