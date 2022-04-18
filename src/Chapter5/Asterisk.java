package Chapter5;


public class Asterisk {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <i+1 ; j++) {
                System.out.printf("*" );
                System.out.print(" ");

            }
            System.out.println();

        }
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.printf("*");
                System.out.print(" ");
            }
            for (int j = 10-1; j < 1; j--) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}