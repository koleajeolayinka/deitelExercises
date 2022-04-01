package Chapter5;

public class page5_15 {
    public static void main(String[] args) {

        int line;
        int star;

        for (line = 1; line <= 10; line++) {
            for (star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }

    public static void pagey(int number) {
        int row;
        int column;
        for (row = 1; row <= 10; row--) {
            for (column = 1; column <= row; column--) {
                System.out.println("\t\t\t\t*");
            }
            System.out.println();
        }

    }

    private static void line22(int line2) {
        int line1;
        int column2;

        for (line2 = 1; line2 <= 5; line2++) {
            for (column2 = 1; column2 <= line2; column2++) {
                System.out.print("*");
            }
            System.out.println();


        }

    }
}