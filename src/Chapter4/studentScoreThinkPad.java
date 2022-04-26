package Chapter4;

import java.util.Scanner;

public class studentScoreThinkPad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER NUMBER OF STUDENT");
        int stuNum = scanner.nextInt();

        System.out.println("ENTER TOTAL NUMBERS OF SUBJECT ");
        int SUBJECT = scanner.nextInt();

        int[][] array = new int[SUBJECT][stuNum];

        System.out.println();
        for (int j = 1; j <= stuNum; j++)
            for (int k = 1; k <= SUBJECT; k++) {
                System.out.println("ENTER STUDENT" + j + " SUB" + k + " SCORE");
                int valid = scanner.nextInt();

                System.out.print("STUDENT");
                for (int i = 1; i <= stuNum; i++) {
                    System.out.print("\t\t SUB" + i);
                }
                System.out.println();
                for (int p = 1; p <= SUBJECT; p++) {
                    System.out.println("STUDENT" + p + "\t\t\t\t" + valid);

                }


            }
    }
}





