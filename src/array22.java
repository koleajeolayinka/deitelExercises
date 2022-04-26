public class array22 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            sum = sum + array[row];

        }
        System.out.println("single dimension array: " + sum);

       int [][] array2 = {{1,2},
                            {2},
                            {2}};
       int sum1= 0;
        for (int row = 0; row < array2.length; row++) {
            for (int column = 0; column < array2[row].length; column++) {
                sum1 = sum1 + array2[row][column];

            }

        }
        System.out.println("\nM.D array: " + sum1);


        }
    }

