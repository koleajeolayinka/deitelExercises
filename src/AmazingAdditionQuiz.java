import java.util.Scanner;

public class AmazingAdditionQuiz {
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);
        int number1 = (int) System.nanoTime() % 10;
        int number2 = (int) System.currentTimeMillis() / 10 % 10;
        System.out.println("WELCOME TO THE BEST QUIZ IN THE WORLD");
        System.out.println("what is " + number1 + " + " + number2 + "?");
        int answer = add.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
        int nu = number1 + number2;
        if (answer == nu) {
            System.out.print("you're correct");
        }  if (answer != nu) {
            System.out.println("you're wrong");

        }

    }
}