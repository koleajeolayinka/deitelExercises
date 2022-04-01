package workSpace;


public class arrayIndexFrom1To300 {
    public static void main(String[] args) {
        int[] array = new int[300];

        for (int i = 0; i < 300; i++) { //300 or length
            array[i] = i+1;


        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");


        }


    }
}


