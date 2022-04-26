import java.util.Scanner;

public class clean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many number do you want to add");
        int row = scanner.nextInt();
        System.out.println("enter number to add");
        int column = scanner.nextInt();
        int[][] array = new int[row][column];
        int sum = 0;
        for (row = 0; row < array.length; row++) {
            sum = 0;

            for (column = 0; column < array[row].length; column++) {
                sum = sum + array[row][column];
                System.out.print(sum);

            }
            System.out.println();
        }
        System.out.println(sum);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }


    }
}
