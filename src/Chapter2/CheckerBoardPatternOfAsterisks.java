package Chapter2;
//2.27 (Checkerboard Pattern of Asterisks) Write an application that displays a checkerboard pat-
//        tern, as follows:
//        * * * * * * * *
//         * * * * * * * *
//        * * * * * * * *
//         * * * * * * * *
//        * * * * * * * *
//         * * * * * * * *
//        * * * * * * * *
//         * * * * * * * *
public class CheckerBoardPatternOfAsterisks {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.print("* * * * * * * * ");
            System.out.println();
            System.out.print(" * * * * * * * *");
            System.out.println();
        }
    }
}
