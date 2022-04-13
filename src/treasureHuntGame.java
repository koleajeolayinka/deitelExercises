import java.util.Scanner;

public class treasureHuntGame {
    public static void main(String[] args) {


            //*this method will actually print the board and fill it with the rows and columns labels
            //and will be filled with the users' input: D if dug already or X if treasure been found

            int[][] board = new int[10][10];
            String[] nums = {"  1", "  2", "  3", "  4", "  5", "  6", "  7", "  8", "  9", " 10"};
            // char letters = 65;
            String[] letters = {"    A", "  B", "  C", "  D", "  E", "  F", "  G", "  H", "  I", "  J"};
            for (int i = 0; i < board.length; i++) {

                System.out.print(letters[i]);
                //   letters++;
            }
            System.out.println("");

            for (int i = 0; i < board.length; i++) {
                System.out.print(nums[i]);

                for (int j = 0; j < board.length; j++) {

                    if (board[i][j] == 0) { //empty index
                        System.out.print("__|");
                    } else if (board[i][j] == 1) { //when user input wont be an empty index so print d|
                        System.out.println("d|");
                    } else if (board[i][j] == -1) { //-1 already filled position with the treasure location so print x|

                        System.out.println("x|");

                    }


                    int userRow, userColumn;

                    do {
                        Scanner myScanner = new Scanner(System.in);
                        System.out.println("Please enter row");
                        userRow = myScanner.nextInt() - 1;
                        System.out.println("Please enter column");
                        userColumn = myScanner.nextInt() - 1;

                        if (board[userRow][userColumn] == -1) {
                            System.out.println("That square has been used. Pick again");
                        }

                    } while (board[userRow][userColumn] != 0);

                    if ((board[userRow][userColumn]) == 1) {
                    } else {
                        board[userRow][userColumn] = 1;
                    }
                }
            }
        }
    }
