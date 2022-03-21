package Chapter5;

public class page5_15<line2> {
    public static void main(String[] args) {

        int line;
        int star;

        for (line = 1; line <= 5; line++) {
            for (star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }

    private static void page5_15(int number) {
        int row;
        int column;
        for (row = 5; row >= 0; row--) {
            for (column = 0; column <= 5; column++) {
                System.out.println(column + " ");
            }
            System.out.println();
        }

    }
}