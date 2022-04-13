package workSpace;

import java.util.Scanner;

public class studentScoreArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter number of student");
        int numberOfStudent = scanner.nextInt();

        System.out.println(" enter total subject taking per student each");
        int subject = scanner.nextInt();

        int[][] score = new int[numberOfStudent][subject];
        for (int i = 0; i < numberOfStudent; i++) {
            for (int j = 0; j < subject; j++) {
                System.out.println("Enter student scores");
                int studentScores = scanner.nextInt();
                score[i][j]=studentScores;
            }

        }for (int i = 0; i < numberOfStudent; i++) {
            for (int j = 0; j < subject; j++) {
                System.out.print(score[i][j] + " ");
            }
            System.out.println();
        }
//        int studentScore = scanner.nextInt();
//
//        for (int i = 0; i <numberOfStudent; i++) {
//            score[numberOfStudent][subject] = i + 1;
//
//        }

//        for (int i = 0; i < numberOfStudent ; i++) {
//            for (int j= 0; j < subject; j++) {
//                System.out.print(score[i][j] + " ");
//            }
//            System.out.println();
//
//        }
//        for (int i = 0; i < subject ; i++) {
//            for (int j = 0; j < numberOfStudent; j++) {
//
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < 30; i++) {
//        score[0][30] = i +1;
//        int studentScore1= scanner.nextInt();
//        }
//
//        for (int i = 0; i < score.length; i++) {
//        System.out.println(score[0][30] + "enter student score ");


    }
}
