//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
///*
// * Simple treasure finding game.
// *
// * +------------------------+
// * ¦ 34 ¦ 21 ¦ 32 ¦ 41 ¦ 25 ¦
// * ------+----+----+----+---¦
// * ¦ 14 ¦ 42 ¦ 43 ¦ 14 ¦ 31 ¦
// * ------+----+----+----+---¦
// * ¦ 54 ¦ 45 ¦ 52 ¦ 42 ¦ 23 ¦
// * ------+----+----+----+---¦
// * ¦ 33 ¦ 15 ¦ 51 ¦ 31 ¦ 35 ¦
// * ------+----+----+----+---¦
// * ¦ 21 ¦ 52 ¦ 33 ¦ 13 ¦ 23 ¦
// * +------------------------+
// * Do you like treasure hunts? In this problem you are to write a program to explore the above array for a treasure. The values in the array are clues.
// * Each cell contains an integer between 11 and 55; for each value the ten's digit represents the row number and the unit's digit represents the column number of the cell containing the next clue.
// * Starting in the upper left corner (at 1,1), use the clues to guide your search of the array. (The first three clues are 11, 34, 42).
// * i.e. Cell (1,1) contains 34, which means go to cell 3, 4
// * Cell(3,4) contains 42 which means go to cell 4,2…..
// * The treasure is a cell whose value is the same as its coordinates.
// * Answered for : http://www.cramster.com/answers-may-12/computer-science/java-treasure-hunt-premise_2516915.aspx
// * Answered on : 7/5/12
// */
//public class TreasureGame {
//    // has-a number of tries
//    private int numberOfTriesLeft = 50;
//    //has-a number of hidden treasure
//    private int numberStillHidden = 20;
//    // Purpose: Subtract 1 try for every attempt taken by the player
//    public void reduceTriesLeft()
//    {
//        numberOfTriesLeft -= 1;
//    }
//
//    public void reduceNumberStillHidden()
//    {
//        numberStillHidden -=1;
//    }
//
//    public int getNumberStillHidden()
//    {
//        return numberStillHidden;
//    }
//
//    public int getNumberOfTriesLeft()
//    {
//        return numberOfTriesLeft;
//    }
//}
////0
////        ```
////        import java.awt.*;
////        import javax.swing.*;
////        import java.util.Random;
////```
////        ```
////        import javax.swing.*;
////```
////        ```
////```
////        ```
////        import java.awt.event.*;
////```
////        ```
////        import java.awt.*;
////        import java.awt.event.*;
////        import javax.swing.*;
////```
////        Expert Answerinformation icon
//        You can create an Arraylist which  is better than array , and store the Randomized Trasure Location . Then use this location to create the Treasure Button , else create the Empty Button . I have highlighted the code canges below in the 'TreasureGame... view the full answer
//        This problem has been solved!
