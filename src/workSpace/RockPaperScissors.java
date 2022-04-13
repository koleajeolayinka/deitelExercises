package workSpace;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args){
        boolean tie = true;
        do{
            String computer = computerChoice();
            String user = userChoice();
            tie = (computer.compareTo(user) == 0);
            determineWinner(computer, user);
        }while(tie);

    }

    public static String computerChoice( ){
        Random rand = new Random();
        int cinput = rand.nextInt(3)+ 1;
        String computer = "thing";
        if (cinput == 1)
            computer = "Rock";
        if (cinput == 2)
            computer = "Paper";
        if (cinput == 3)
            computer = "Scissors";
        return computer;
    }
    public static String userChoice(){
        Scanner sc = new Scanner(System.in);
        String user = "default";
        do{
            System.out.println("""
                    choose your weapon(Paper,Scissors or Rock)
                    
                    ...........    * * *      *        *    *   *
                     0 0 0 0 0.    * * '    *   *    *      **
                     00 0 0 0 0 0  *   *      *        *    *   *
                    === === === === === === === === === === === === === === === === === ===
                    * * * * * * *      * * *      *      * * *     | * * *     * * *.
                     * * * * * * *     * * *    * * *    * * *     | * * *     * * '`  
                   * * * * * * * *     *        *    *   *         | * * *     *   *
                    === === === === === === === === === === === === === === === === === ===
                    *****
                    ******,      *.     *    '     *.    *.       *     * * *     *.
                    **         *      *      |   *     *        *   *   * * '   *
                    **         . *      *    |    .*     .*       *     *   *     ,*
                    === === === === === === === === === === === === === === === === === === ===
                    """);
            user = sc.nextLine();
        }
        while (isValidChoice (user) == false);
        return user;
    }
    public static boolean isValidChoice(String choice){
        boolean status;
        if (choice.compareTo("Rock")== 0)
            status = true;
        else if (choice.compareTo("Paper")== 0)
            status = true;
        else if (choice.compareTo("Scissors")== 0)
            status = true;
        else{
            status = false;
            System.out.println("Error! Make sure your first letter is capitalize kindly input your                    choices");
        }

        return status;
    }
    public static boolean determineWinner(String computer, String user){
        System.out.println (" Computer Choice: " + computer);
        System.out.println ("Your Choice : " + user);
        if (computer.compareTo( "Rock" ) == 0 && user.compareTo  ("Scissors") == 0)
            System.out.println (" Computer wins! Better luck next time!");
        if (computer.compareTo("Scissors")== 0 && user.compareTo("Paper") == 0)
            System.out.println (" Computer wins! Better luck next time!");
        if (computer.compareTo("Paper") == 0 && user.compareTo("Rock") == 0)
            System.out.println (" Computer wins! Better luck next time!");
        if (computer.compareTo("Rock") == 0 && user.compareTo("Paper") == 0)
            System.out.println (" You win!!");
        if (computer.compareTo("Scissors") == 0 && user.compareTo("Rock") == 0)
            System.out.println (" You win!!");
        if (computer.compareTo("Paper") == 0 && user.compareTo("Scissors") == 0)
            System.out.println (" You win!!");
        else if (computer.compareTo(user) == 0 ){
            System.out.println(" Tie! the game must be played again.");
            return false;
        }
        return true;
    }
}
