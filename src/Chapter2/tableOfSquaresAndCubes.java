package Chapter2;
import java.util.Scanner;

public class tableOfSquaresAndCubes {
    public static void main(String [] args){
        Scanner table = new Scanner(System.in);
        int digit = 0;
        int square =  digit * digit;
        int cube = digit * digit * digit;

        int digit1=1;
               int square1 = digit1 * digit1;
               int cube1 = digit1* digit1 * digit1;

        int digit2=2;
        int square2 = digit2 * digit2;
        int cube2 = digit2* square2;

        int digit3=3;
        int square3 = digit3 * digit3;
        int cube3 = digit3* digit3 * digit3;

        int digit4=4;
        int square4 = digit4 * digit4;
        int cube4 = digit4* digit4 * digit4;

        int digit5=5;
        int square5 = digit5 * digit5;
        int cube5 = digit5* digit5 * digit5;

        int digit6=6;
        int square6 = digit6 * digit6;
        int cube6 = digit6* digit6 * digit6;

        int digit7=7;
        int square7 = digit7 * digit7;
        int cube7 = digit7* digit7 * digit7;

        int digit8=8;
        int square8 = digit8 * digit8;
        int cube8 = digit8* digit8 * digit8;

        int digit9=9;
        int square9 = digit9 * digit9;
        int cube9 = digit9* digit9 * digit9;

        int digit10=10;
        int square10 = digit10 * digit10;
        int cube10 = digit10* digit10 * digit10;


        System.out.println("number    square    cube");
        System.out.printf(" %d  %d  %d%n", digit1,  digit1,   square1   );
        System.out.printf(" %d  %d  %d%n", digit2,  digit2,   square2   );
        System.out.printf(" %d  %d  %d%n", digit3,  digit3,   square3  );
        System.out.printf(" %d  %d  %d%n", digit4,  digit4,   square4   );
        System.out.printf(" %d  %d  %d%n", digit5,  digit5,   square5   );
        System.out.printf(" %d  %d  %d%n", digit6,  digit6,   square6   );
        System.out.printf(" %d  %d  %d%n", digit7,  digit7,   square7   );
        System.out.printf(" %d  %d  %d%n", digit8,  digit8,   square8   );
        System.out.printf(" %d  %d  %d%n", digit9,  digit9,   square9   );
        System.out.printf(" %d %d %d%n", digit10,  digit10,   square10   );


    }

}
