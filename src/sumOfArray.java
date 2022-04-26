public class sumOfArray {
    public static void main(String[] args) {

        int number = 0;
        int number2 = 0;
        int[][] array = {{2,3},
                       {2,2,2,2,},
                        {5}};
        int sum = 0;
        for (int row = 0; row< array.length; row++) {
            for (int column= 0; column < array[row].length; column++) {
               sum = sum + array[row][column] ;
                //System.out.println(sum);

            }

        }
        System.out.println(sum);


//        System.out.println("first dimension array element " + number);
//        System.out.println("second dimension array element " + number2);

    }
}