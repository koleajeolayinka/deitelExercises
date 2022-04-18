package Chapter4;

import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.println("ENTER STUDENT1 NAME ");
        String student1 = grade.next();

        System.out.println("ENTER " + student1 + " SCORE");
        int grade1 = Integer.parseInt(grade.next());

        System.out.println("ENTER STUDENT2 NAME ");
        String student2 = grade.next();
        System.out.println("ENTER " + student2 + " SCORE");
        int grade2 = grade.nextInt();

        System.out.println("ENTER STUDENT3 NAME ");
        String student3 = grade.next();
        System.out.println("ENTER " + student3 + " SCORE");
        int grade3 = grade.nextInt();

        System.out.println("ENTER STUDENT4 NAME ");
        String student4 = grade.next();
        System.out.println("ENTER " + student4 + " SCORE");
        int grade4 = grade.nextInt();

        System.out.println("ENTER STUDENT1 NAME ");
        String student5 = grade.next();
        System.out.println("ENTER " + student5 + " SCORE");
        int grade5 = grade.nextInt();

        int total = (grade1 + grade2 + grade3 + grade4 + grade5);
        int average = total / 5;

        if (grade1 >= 50 && grade1 <= 100) {
            System.out.println(student1 + "SCORE " + grade1 + " GRADE IS A");
        } else if
        (grade1 >= 0 && grade1 <= 49) {
            System.out.println(student1 + " SCORE " + grade1 + " GRADE IS B");

        }
        if (grade2 >= 50 && grade2 <= 100) {
            System.out.println(student2 + " SCORE " + grade2 + " GRADED IS A");
        } else if
        (grade2 >= 0 && grade2 <= 49) {
            System.out.println(student2 + " SCORE " + grade2 + " GRADED IS B");

        }

        if (grade3 >= 50 && grade3 <= 100) {
            System.out.println(student3 + " SCORE " + grade3 + "  GRADED IS A");
        } else if
        (grade3 >= 0 && grade3 <= 49) {
            System.out.println(student3 + " SCORE " + grade3 + " GRADED IS B");
        }

        if (grade4 >= 50 && grade4 <= 100) {
            System.out.println(student4 + " SCORE " + grade4 + " GRADED IS A");
        } else if
        (grade4 >= 0 && grade4 <= 49) {
            System.out.println(student4 + " SCORE " + grade4 + " GRADED IS B");

        }


        if (grade5 >= 50 && grade5 <= 100) {
            System.out.println(student5 + " SCORE " + grade5 + " GRADED IS A");
        } else if
        (grade5 >= 0 && grade5 <= 49) {
            System.out.println(student5 + " SCORE " + grade5 + " GRADED IS B");

        }
        if (grade1 < grade2) {
            System.out.println(grade1);
        }
        if (grade1 < grade3) {
            System.out.println(grade1);
        }
        if (grade1 < grade4) {
            System.out.println(grade1);
        }
        if (grade1 < grade5) {
            System.out.println(grade1);
        }
        if (grade2 < grade1) {
            System.out.println(grade2)
            ;
        }
        if (grade2 < grade3) {
            System.out.println(grade2);
        }
        if (grade2 < grade4) {
            System.out.println(grade1);
        }
        if (grade1 < grade5) {
            System.out.println(grade1);

        }
        System.out.println("TOTAL SCORE IS " + total);
        System.out.println("AVERAGE SCORE IS " + average);

        String table = """
                SUBJECT SUMMARY
                 
                """ +
                student1 +
                """
                Highest scoring student is: """ + "";


    }

}
