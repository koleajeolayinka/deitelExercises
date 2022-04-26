import Chapter8.Time;

import java.util.Scanner;

public class importXTime {
    static Scanner scanner = new Scanner(System.in);
    static Time time = new Time( 23, 59,59);

    public static void main(String[] args) {
        runTimeReaderApp();
    }

    private static void runTimeReaderApp() {
        String User_input = """
                --> enter transport allowance detailed
                --> enter feeding allowance
                --> tax rate
                --> enter current time of payment
                --> Saved INFO
                """;
        System.out.println(User_input);
        int userI = scanner.nextInt();
        switch (userI) {
            case 1: TransportAllowance();
            case 2: feedingAllowance();
            case 3: taxRate();
            case 4: Time();
            case 5: SaveD();


        }


    }

    private static void SaveD() {
        System.out.println();

    }

    private static void Time() {
        System.out.println("please kindly input current time: ");
        System.out.println("\n\nenter current hour");
        int CurrentT = scanner.nextInt();
//Time.validMinute();

    }

    private static void taxRate() {


    }

    private static void feedingAllowance() {


    }

    private static void TransportAllowance() {


    }
}