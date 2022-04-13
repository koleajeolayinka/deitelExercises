import java.util.*;
public class CrapsGame {

    public static void main (String[]args) {



        String restart = "y";
        Scanner scan = new Scanner(System.in);
        int sum=rollDice();
        int points = points(sum);
        boolean youWin=youWin(sum, points);

        while(restart.equals("y")){
            youWin=false;
            while(youWin==false){
                rollDice();
                sum=rollDice();
                points=points(sum);
                youWin=youWin(sum, points);
            }


            System.out.print("\nWould you like to play again? y or n: ");
            restart = scan.next();
        }
        System.out.print("The program has ended!");
    }
    public static int rollDice()
    {
        int num1= (int)(6.0*Math.random() + 1.0); //first die
        int num2= (int)(6.0*Math.random() + 1.0); //second die
        int sum= num1 + num2; //sum of roll
        System.out.printf("\nYou have rolled %d + %d = %d\n", num1, num2, sum);  //Prints the sum
        return sum;
    }


    public static int points(int sum)
    {
        int points=0;
        if (sum>=4 && sum<=6) {  //Counts points based on your rolls
            points = points + 1;
            System.out.print("Your points are: " + points);
        }
        else if (sum>=8 && sum<=10){
            points = points + 1;
            System.out.print("Your points are: " + points);
        }
        return points;
    }

    public static boolean youWin(int sum, int points)
    {
        boolean youWin=false;
        if (sum==2 || sum==3 || sum == 12) {
            youWin=false;
            System.out.print("You lost with a " + sum);  //Determines if you win or loose based on the sum and points and returns the youWin boolean
        }
        else if (sum==7 || sum==11) {
            youWin=true;
            System.out.print("You won with a " + sum);
        }
        else if (points==7){
            youWin=true;
        }
        return youWin;
    }

}
