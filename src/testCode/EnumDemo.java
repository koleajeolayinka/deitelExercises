package testCode;

import com.sun.jdi.PathSearchingVirtualMachine;

public class EnumDemo {
//    Define the enum type -- remember that the definitions
//    go OUTSIDE THE main() routine!
    enum Day { SUNDAY, MONDAY, TUESDAY,WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

    enum Month { JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, OCT, DECEMBER}

    public static void main(String[] args) {
        Day tgif;
        Month libra;
// Declare a variable of type Day.
// Declare a variable of type Month.
        tgif = Day.FRIDAY;
        libra = Month.OCT;
// Assign a value of type Day to tgif.
// Assign a value of type Month to libra.
        System.out.print("My sign is libra, since I was born in ");
        System.out.println(libra);
// Output value will be: OCT
        System.out.print("That’s the ");
        System.out.print( libra.ordinal() );
        System.out.println("-th month of the year.");
        System.out.println(" (Counting from 0, of course!)");
        System.out.print("Isn’t it nice to get to ");
        System.out.println(tgif);
// Output value will be: FRIDAY
        System.out.println( tgif + " is the " + tgif.ordinal()
                + "-th day of the week.");

    }
}
