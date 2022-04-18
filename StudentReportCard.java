package AssignmentDen;

import java.util.Scanner;

public class StudentReportCard {
    static Scanner Report = new Scanner(System.in);
    static int[] array = new int[1];

    public static void main(String[] args) {
        userInput();


    }


    public static void userInput() {
        System.out.println("WELCOME TO STUDENT GRADE DEN");

        System.out.println("ENTER STUDENT1 NAME");
        String Student1 = Report.nextLine();
        System.out.println("ENTER STUDENT2 NAME");
        String Student2 = Report.nextLine();
        System.out.println("ENTER STUDENT3 NAME");
        String Student3 = Report.nextLine();

        System.out.println("ENTER " + Student1 + " SUB1 SCORE ");
        int STU11 = Report.nextInt();
        System.out.println("ENTER " + Student1 + " SUB2 SCORE ");
        int STU12 = Report.nextInt();
        System.out.println("ENTER " + Student1 + " SUB3 SCORE ");
        int STU13 = Report.nextInt();
        System.out.println("ENTER " + Student1 + " POSITION BETWEEN 1 - 3");
        int pos1 = Report.nextInt();
        if (pos1 > 3) {
            System.out.println("NOT GRADED");

        }

        System.out.println("ENTER " + Student2 + " SUB1 SCORE ");
        int STU21 = Report.nextInt();
        System.out.println("ENTER " + Student2 + " SUB2 SCORE ");
        int STU22 = Report.nextInt();
        System.out.println("ENTER " + Student2 + " SUB3 SCORE ");
        int STU23 = Report.nextInt();
        System.out.println("ENTER " + Student2 + " POSITION BETWEEN 1 - 3");
        int pos2 = Report.nextInt();
        if (pos2 > 3) {
            System.out.println("NOT GRADED");

        }


        System.out.println("ENTER " + Student3 + " SUB1 SCORE ");
        int STU31 = Report.nextInt();
        System.out.println("ENTER " + Student3 + " SUB2 SCORE ");
        int STU32 = Report.nextInt();
        System.out.println("ENTER " + Student3 + " SUB3 SCORE ");
        int STU33 = Report.nextInt();
        System.out.println("ENTER " + Student3 + " POSITION BETWEEN 1 - 3");
        int pos3 = Report.nextInt();
        if (pos3 > 3) {
            System.out.println("NOT GRADED");

        }

        int total1 = STU11 + STU12 + STU13;
        int total2 = STU21 + STU22 + STU23;
        int total3 = STU31 + STU32 + STU33;

        int ave1 = (STU11 + STU12 + STU13) / 3;
        int ave2 = (STU21 + STU22 + STU23) / 3;
        int ave3 = (STU13 + STU23 + STU33) / 3;

        if (total1 > total2 && total1 < total3) {
            System.out.println(1);

        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.println("   ");

            }

        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 29; j++) {
                System.out.print("=");
                System.out.print("=");

            }

        }

        System.out.printf("%n%s%8s%8s%8s%8s%8s%8s%n", "STUDENT", "SUB1", "SUB2", "SUB3", "TOT", "AVE", "POS");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 29; j++) {
                System.out.print("=");
                System.out.print("=");

            }

        }

        for (int counter = 0; counter < array.length; counter++) {
            if (pos1 > 3) {
                System.out.print(Student1 + " position is not graded ");
            }
            if (pos2 > 3) {
                System.out.print(Student1 + " position is not graded ");
            }
            if (pos3 > 3) {
                System.out.print(Student1 + " position is not graded ");
            }
            System.out.printf("%n%5s%8s%8s%8s%8s%8s%8s%n", Student1, STU11, STU12, STU13, total1, ave1, pos1, array[counter]);
            System.out.printf("%n%5s%8s%8s%8s%8s%8s%8s%n", Student2, STU21, STU22, STU23, total2, ave2, pos2, array[counter]);
            System.out.printf("%n%5s%8s%8s%8s%8s%8s%8s%n", Student3, STU31, STU32, STU33, total3, ave3, pos3, array[counter]);

        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 29; j++) {
                System.out.print("=");
                System.out.print("=");

            }

        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++)
                System.out.println(" ");


        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 29; j++) {
                System.out.print("=");
                System.out.print("=");

            }
        }
        /*
         *SUBJECT SUMMARY
         */
        System.out.println("\nSUBJECT SUMMARY\n\n --> SUB 1");

        //HIGHEST SCORING STUDENT
        if (STU11 > STU21 && STU11 > STU31) {
            System.out.println("Highest scoring student is: " + Student1 + " scoring " + STU11);

        }
        if (STU21 > STU11 && STU21 > STU31) {
            System.out.println("Highest scoring student is: " + Student2 + " scoring " + STU21);

        }
        if (STU31 > STU11 && STU31 > STU21) {
            System.out.println("Highest scoring student is: " + Student3 + " scoring " + STU31);

        }
        if (STU11 == STU21 && STU11 == STU31) {
            System.out.println("Highest scoring student is: Equal marks");
        }
        /*
         * SUBJECT 1 SUMMARY FOR LOWEST SCORE
         */
        if (STU11 < STU21 && STU11 < STU31) {
            System.out.println("Lowest scoring student is: " + Student1 + " scoring " + STU11);

        }
        if (STU21 < STU11 && STU21 < STU31) {
            System.out.println("Lowest scoring student is: " + Student2 + " scoring " + STU21);

        }
        if (STU31 < STU11 && STU31 < STU21) {
            System.out.println("Lowest scoring student is: " + Student3 + " scoring " + STU31);

        }
        if (STU11 == STU21 && STU11 == STU31) {
            System.out.println("Lowest scoring student is: Equal marks");
        }
        // TOTAL SCORE
        System.out.println("Total Score is: " + (STU11 + STU21 + STU31));
        // AVERAGE SCORE
        System.out.println("Average score is: " + (STU11 + STU21 + STU31) / 3);
        /*
         *NUMBER OF PASS MARK FOR THREE STUDENT
         */
        if (STU11 >= 50 && STU31 >= 50 && STU21 >= 50) {
            System.out.println("NUMBER OF PASSES: 3");

        }
        if (STU11 >= 50 && STU31 >= 50 && STU21 >= 50) {
            System.out.println("NO STUDENT PASSED");

        }
        /*
         * NUMBER OF PASS MARK FOR TWO STUDENT
         */
        if (STU11 >= 50 && STU31 >= 50 && STU21 <= 50) {
            System.out.println("NUMBER OF PASSES: 2");

        }
        if (STU11 >= 50 && STU31 <= 50 && STU21 >= 50) {
            System.out.println("NUMBER OF PASSES: 2");

        }
        if (STU11 <= 50 && STU31 >= 50 && STU21 >= 50) {
            System.out.println("NUMBER OF PASSES: 2");

        }
        /*
         * NUMBER OF PASS MARK FOR ONE STUDENT
         */
        if (STU11 >= 50 && STU31 <= 50 && STU21 <= 50) {
            System.out.println("NUMBER OF PASSES: 1");

        }
        if (STU11 <= 50 && STU31 >= 50 && STU21 <= 50) {
            System.out.println("NUMBER OF PASSES: 1");

        }
        if (STU11 <= 50 && STU31 <= 50 && STU21 >= 50) {
            System.out.println("NUMBER OF PASSES: 1");


        }

        /*
         *NUMBER OF FAIL MARK FOR THREE STUDENT
         */
        if (STU11 <= 50 && STU31 <= 50 && STU21 <= 50) {
            System.out.println("NUMBER OF FAILS: 3");

        }

        if (STU11 >= 50 && STU31 >= 50 && STU21 >= 50) {
            System.out.println("NO STUDENT FAIL");

        }
        /*
         * NUMBER OF FAIL MARK FOR TWO STUDENT
         */
        if (STU11 <= 50 && STU31 <= 50 && STU21 >= 50) {
            System.out.println("NUMBER OF FAILS: 2");

        }
        if (STU11 >= 50 && STU31 <= 50 && STU21 <= 50) {
            System.out.println("NUMBER OF FAILS: 2");

        }
        if (STU11 <= 50 && STU31 >= 50 && STU21 <= 50) {
            System.out.println("NUMBER OF FAILS: 2");

        }
        /*
         * NUMBER OF FAIL MARK FOR ONE STUDENT
         */
        if (STU11 >= 50 && STU31 >= 50 && STU21 <= 50) {
            System.out.println("NUMBER OF FAILS: 1");

        }
        if (STU11 <= 50 && STU31 >= 50 && STU21 >= 50) {
            System.out.println("NUMBER OF FAILS: 1");

        }
        if (STU11 >= 50 && STU31 <= 50 && STU21 >= 50) {
            System.out.println("NUMBER OF FAILS: 1");


        }


// SUB 2


        System.out.println("\n\n--> SUB 2");

        //HIGHEST SCORING STUDENT
        if (STU12 > STU22 && STU12 > STU32) {
            System.out.println("Highest scoring student is: " + Student1 + " scoring " + STU12);

        }
        if (STU22 > STU12 && STU22 > STU32) {
            System.out.println("Highest scoring student is: " + Student2 + " scoring " + STU22);

        }
        if (STU32 > STU12 && STU32 > STU22) {
            System.out.println("Highest scoring student is: " + Student3 + " scoring " + STU32);

        }
        if (STU12 == STU22 && STU12 == STU32) {
            System.out.println("Highest scoring student is: Equal marks");
        }
        /*
         * SUBJECT 1 SUMMARY FOR LOWEST SCORE
         */
        if (STU12 < STU22 && STU12 < STU32) {
            System.out.println("Lowest scoring student is: " + Student1 + " scoring " + STU12);

        }
        if (STU22 < STU12 && STU22 < STU32) {
            System.out.println("Lowest scoring student is: " + Student2 + " scoring " + STU22);

        }
        if (STU32 < STU12 && STU32 < STU22) {
            System.out.println("Lowest scoring student is: " + Student3 + " scoring " + STU32);

        }
        if (STU12 == STU22 && STU12 == STU32) {
            System.out.println("Lowest scoring student is: Equal marks");
        }
        // TOTAL SCORE
        System.out.println("Total Score is: " + (STU12 + STU22 + STU32));
        // AVERAGE SCORE
        System.out.println("Average score is: " + (STU12 + STU22 + STU32) / 3);
        /*
         *NUMBER OF PASS MARK FOR THREE STUDENT
         */
        if (STU12 >= 50 && STU32 >= 50 && STU22 >= 50) {
            System.out.println("NUMBER OF PASSES: 3");

        }
        /*
         * NUMBER OF PASS MARK FOR TWO STUDENT
         */
        if (STU12 >= 50 && STU32 >= 50 && STU22 <= 50) {
            System.out.println("NUMBER OF PASSES: 2");

        }
        if (STU12 >= 50 && STU32 <= 50 && STU22 >= 50) {
            System.out.println("NUMBER OF PASSES: 2");

        }
        if (STU12 <= 50 && STU32 >= 50 && STU22 >= 50) {
            System.out.println("NUMBER OF PASSES: 2");

        }
        /*
         * NUMBER OF PASS MARK FOR ONE STUDENT
         */
        if (STU12 >= 50 && STU32 <= 50 && STU22 <= 50) {
            System.out.println("NUMBER OF PASSES: 1");

        }
        if (STU12 <= 50 && STU32 >= 50 && STU22 <= 50) {
            System.out.println("NUMBER OF PASSES: 1");

        }
        if (STU12 <= 50 && STU32 <= 50 && STU22 >= 50) {
            System.out.println("NUMBER OF PASSES: 1");

        }


        /*
         *NUMBER OF FAIL MARK FOR THREE STUDENT
         */
        if (STU12 <= 50 && STU32 <= 50 && STU22 <= 50) {
            System.out.println("NUMBER OF FAILS: 3");

        }
        /*
         * NUMBER OF FAIL MARK FOR TWO STUDENT
         */
        if (STU12 <= 50 && STU32 <= 50 && STU22 >= 50) {
            System.out.println("NUMBER OF FAILS: 2");

        }
        if (STU12 >= 50 && STU32 <= 50 && STU22 <= 50) {
            System.out.println("NUMBER OF FAILS: 2");

        }
        if (STU12 <= 50 && STU32 >= 50 && STU22 <= 50) {
            System.out.println("NUMBER OF FAILS: 2");

        }
        /*
         * NUMBER OF FAIL MARK FOR ONE STUDENT
         */
        if (STU12 >= 50 && STU32 >= 50 && STU22 <= 50) {
            System.out.println("NUMBER OF FAILS: 1");

        }
        if (STU12 <= 50 && STU32 >= 50 && STU22 >= 50) {
            System.out.println("NUMBER OF FAILS: 1");

        }
        if (STU12 >= 50 && STU32 <= 50 && STU22 >= 50) {
            System.out.println("NUMBER OF FAILS: 1");


        }


        System.out.println("\n\n --> SUB 3");

        //HIGHEST SCORING STUDENT
        if (STU13 > STU23 && STU13 > STU33) {
            System.out.println("Highest scoring student is: " + Student1 + " scoring " + STU13);

        }
        if (STU23 > STU13 && STU23 > STU33) {
            System.out.println("Highest scoring student is: " + Student2 + " scoring " + STU23);

        }
        if (STU33 > STU13 && STU33 > STU23) {
            System.out.println("Highest scoring student is: " + Student3 + " scoring " + STU33);

        }
        if (STU13 == STU23 && STU13 == STU33) {
            System.out.println("Highest scoring student is: Equal marks");
        }
        /*
         * SUBJECT 1 SUMMARY FOR LOWEST SCORE
         */
        if (STU13 < STU23 && STU13 < STU33) {
            System.out.println("Lowest scoring student is: " + Student1 + " scoring " + STU13);

        }
        if (STU23 < STU13 && STU23 < STU33) {
            System.out.println("Lowest scoring student is: " + Student2 + " scoring " + STU23);

        }
        if (STU33 < STU13 && STU33 < STU23) {
            System.out.println("Lowest scoring student is: " + Student3 + " scoring " + STU33);

        }
        if (STU13 == STU23 && STU13 == STU33) {
            System.out.println("Lowest scoring student is: Equal marks");
        }
        // TOTAL SCORE
        System.out.println("Total Score is: " + (STU13 + STU23 + STU33));
        // AVERAGE SCORE
        System.out.println("Average score is: " + (STU13 + STU23 + STU33) / 3);
        /*
         *NUMBER OF PASS MARK FOR THREE STUDENT
         */
        if (STU13 >= 50 && STU33 >= 50 && STU23 >= 50) {
            System.out.println("NUMBER OF PASSES: 3");

        }
        /*
         * NUMBER OF PASS MARK FOR TWO STUDENT
         */
        if (STU13 >= 50 && STU33 >= 50 && STU23 <= 50) {
            System.out.println("NUMBER OF PASSES: 2");

        }
        if (STU13 >= 50 && STU33 <= 50 && STU23 >= 50) {
            System.out.println("NUMBER OF PASSES: 2");

        }
        if (STU13 <= 50 && STU33 >= 50 && STU23 >= 50) {
            System.out.println("NUMBER OF PASSES: 2");

        }
        /*
         * NUMBER OF PASS MARK FOR ONE STUDENT
         */
        if (STU13 >= 50 && STU33 <= 50 && STU23 <= 50) {
            System.out.println("NUMBER OF PASSES: 1");

        }
        if (STU13 <= 50 && STU33 >= 50 && STU23 <= 50) {
            System.out.println("NUMBER OF PASSES: 1");

        }
        if (STU13 <= 50 && STU33 <= 50 && STU23 >= 50) {
            System.out.println("NUMBER OF PASSES: 1");

        }


        /*
         *NUMBER OF FAIL MARK FOR THREE STUDENT
         */
        if (STU13 <= 50 && STU33 <= 50 && STU23 <= 50) {
            System.out.println("NUMBER OF FAILS: 3");

        }
        /*
         * NUMBER OF FAIL MARK FOR TWO STUDENT
         */
        if (STU13 <= 50 && STU33 <= 50 && STU23 >= 50) {
            System.out.println("NUMBER OF FAILS: 2");

        }
        if (STU13 >= 50 && STU33 <= 50 && STU23 <= 50) {
            System.out.println("NUMBER OF FAILS: 2");

        }
        if (STU13 <= 50 && STU33 >= 50 && STU23 <= 50) {
            System.out.println("NUMBER OF FAILS: 2");

        }
        /*
         * NUMBER OF FAIL MARK FOR ONE STUDENT
         */
        if (STU13 >= 50 && STU33 >= 50 && STU23 <= 50) {
            System.out.println("NUMBER OF FAILS: 1");

        }
        if (STU13 <= 50 && STU33 >= 50 && STU23 >= 50) {
            System.out.println("NUMBER OF FAILS: 1");

        }
        if (STU13 >= 50 && STU33 <= 50 && STU23 >= 50) {
            System.out.println("NUMBER OF FAILS: 1");


        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 29; j++) {
                System.out.print("=");
                System.out.print("=");

            }
        }
        System.out.println();
        /*
         *CHECK HARDEST SUBJECT
         */

        if (STU11 <= 39 && STU12 <= 39 && STU13 <= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB1 WITH 3 FAILURES");

        }
        if (STU21 <= 39 && STU22 <= 39 && STU23 <= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB2 WITH 3 FAILURES");

        }
        if (STU31 <= 39 && STU32 <= 39 && STU33 <= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB2 WITH 3 FAILURES");

        }
        /*
         * NUMBER OF HARDEST SUBJECT WITH 2 FAILURES
         */ //SUBJECT1
        if (STU11 <= 39 && STU12 <= 39 && STU13 >= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB1 WITH 2 FAILURES");

        }
        if (STU11 >= 39 && STU12 <= 39 && STU13 <= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB1 WITH 2 FAILURES");

        }
        if (STU11 <= 39 && STU12 >= 39 && STU13 <= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB1 WITH 2 FAILURES");

        }

        //SUBJECT2
        if (STU21 <= 39 && STU22 <= 39 && STU23 >= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB2 WITH 2 FAILURES");

        }
        if (STU21 >= 39 && STU22 <= 39 && STU23 <= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB2 WITH 2 FAILURES");

        }
        if (STU21 <= 39 && STU22 >= 39 && STU23 <= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB2 WITH 2 FAILURES");

        }

        //SUBJECT 3

        if (STU31 <= 39 && STU32 <= 39 && STU33 >= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB3 WITH 2 FAILURES");

        }
        if (STU31 >= 39 && STU32 <= 39 && STU33 <= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB3 WITH 2 FAILURES");

        }
        if (STU31 <= 39 && STU32 >= 39 && STU33 <= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB3 WITH 2 FAILURES");

        }
        /*
         * NUMBER OF HARDEST SUBJECT WITH 1 FAILURES
         *///SUBJECT 1
        if (STU11 >= 39 && STU12 >= 39 && STU13 <= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB1 WITH 1 FAILURES");

        }
        if (STU11 <= 39 && STU12 >= 39 && STU13 >= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB1 WITH 1 FAILURES");

        }
        if (STU11 >= 39 && STU12 <= 39 && STU13 >= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB1 WITH 1 FAILURES");


        }
        //SUBJECT 2
        if (STU21 >= 39 && STU22 >= 39 && STU23 <= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB2 WITH 1 FAILURES");

        }
        if (STU21 <= 39 && STU22 >= 39 && STU23 >= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB2 WITH 1 FAILURES");

        }
        if (STU21 >= 39 && STU22 <= 39 && STU23 >= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB2 WITH 1 FAILURES");
        }
        //SUBJECT 3
        if (STU31 >= 39 && STU32 >= 39 && STU33 <= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB3 WITH 1 FAILURES");

        }
        if (STU31 <= 39 && STU32 >= 39 && STU33 >= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB3 WITH 1 FAILURES");

        }
        if (STU31 >= 39 && STU32 <= 39 && STU33 >= 39) {
            System.out.println("THE HARDEST SUBJECT IS SUB3 WITH 1 FAILURES");


        }
        /*
         *CHECK EASIEST SUBJECT
         */
        if (STU11 >= 50 && STU12 >= 50 && STU13 >= 50) {
            System.out.println("THE EASIEST SUBJECT IS SUB3 WITH 3 PASSES");

        }

        /*
         * NUMBER OF PASS MARK FOR TWO STUDENT
         */
        if (STU13 >= 50 && STU33 >= 50 && STU23 <= 50) {
            System.out.println("THE EASIEST SUBJECT IS SUB3 WITH 2 PASSES");

        }
        if (STU13 >= 50 && STU33 <= 50 && STU23 >= 50) {
            System.out.println("THE EASIEST SUBJECT IS SUB3 WITH 2 PASSES");

        }
        if (STU13 <= 50 && STU33 >= 50 && STU23 >= 50) {
            System.out.println("THE EASIEST SUBJECT IS SUB3 WITH 2 PASSES");

        }
        /*
         * NUMBER OF PASS MARK FOR ONE STUDENT
         */
        if (STU13 >= 50 && STU33 <= 50 && STU23 <= 50) {
            System.out.println("THE EASIEST SUBJECT IS SUB3 WITH 1 PASSES");

        }
        if (STU13 <= 50 && STU33 >= 50 && STU23 <= 50) {
            System.out.println("THE EASIEST SUBJECT IS SUB3 WITH 1 PASSES");

        }
        if (STU13 <= 50 && STU33 <= 50 && STU23 >= 50) {
            System.out.println("THE EASIEST SUBJECT IS SUB3 WITH 1 PASSES");

        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 29; j++) {
                System.out.print("=");
                System.out.print("=");

            }
        }
        System.out.println("\n\nCLASS SUMMARY");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 29; j++) {
                System.out.print("=");
                System.out.print("=");

            }
        }
        System.out.println("\nBEST GRADUATING STUDENT IS: " + Student1 + " SCORING " + total1 + " IN TOTAL");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 29; j++) {
                System.out.print("=");
                System.out.print("=");

            }
        }
        System.out.println("\n\n");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 29; j++) {
                System.out.print("!");
                System.out.print("!");

            }
        }
        System.out.println();
        System.out.println("WORST GRADUATING STUDENT IS: " + Student3 + " SCORED " + total3 + " IN TOTAL");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 29; j++) {
                System.out.print("!");
                System.out.print("!");

            }
        }
        System.out.println("\n\n");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 29; j++) {
                System.out.print("=");
                System.out.print("=");

            }
        }
        System.out.println();
        System.out.println("CLASS TOTAL SCORE IS: " + (total1 +total2 + total3));
        System.out.println("CLASS AVERAGE SCORE IS: " + (total1 +total2 + total3) / 3);
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 29; j++) {
                System.out.print("=");
                System.out.print("=");

            }
        }

    }
}