package workSpace;

import Chapter4.studentGrade;

import java.security.SecureRandom;

public class rollDieGame {
        public static void main(String[] args) {
// randomNumbers object will produce secure random numbers
            SecureRandom randomNumbers = new SecureRandom();
            int NumberOfDiceOnFace1 = 1;
            int NumberOfDiceOnFace2 = 2;
            int NumberOfDiceOnFace3 = 3;
            int NumberOfDiceOnFace4 = 4;
            int NumberOfDiceOnFace5 = 5;
            int NumberOfDiceOnFace6 = 6;

// tally counts for 60,000,000 rolls of a die
            for (int roll = 1; roll <= 6; roll++) {
                int face = 1 + randomNumbers.nextInt(); // number from 1 to 6
// use face value 1-6 to determine which counter to increment
                switch (face) {
                    case 1:
                        ++NumberOfDiceOnFace1; // increment the 1s counter
                        break;
                    case 2:
                        ++NumberOfDiceOnFace2; // increment the 2s counter
                        break;
                    case 3:
                        ++NumberOfDiceOnFace3; // increment the 3s counter
                        break;
                    case 4:
                        ++NumberOfDiceOnFace4; // increment the 4s counter
                        break;
                    case 5:
                        ++NumberOfDiceOnFace5; // increment the 5s counter
                        break;
                    case 6:
                        ++NumberOfDiceOnFace6; // increment the 6s counter
                        break;
                }
            }
            System.out.println("Face\tNumberOfDiceRoll"); // output headers
            System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t%d%n4\t\t%d%n5\t\t%d%n6\t\t%d%n",
                    NumberOfDiceOnFace1, NumberOfDiceOnFace2, NumberOfDiceOnFace3, NumberOfDiceOnFace4,
                    NumberOfDiceOnFace5, NumberOfDiceOnFace6);


        }
    }
