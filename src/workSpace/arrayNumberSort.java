package workSpace;

import java.util.Arrays;
import java.util.Random;

public class arrayNumberSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");

        }
        /// declare & initialize numbers collection, random generator
        int length = 10;
        int[] randomNumbers = new int[length];
        Random rand = new Random();

// Define range of values
        int min = 0;
        int max = 10;
// Generate random number for each element in array
        for(int i = 0; i < length; i++){
            randomNumbers[i] = rand.nextInt(max - min) + min;
        }
// Print array of random numbers to console as string
        System.out.println(Arrays.toString(randomNumbers));

        int sum = 0;

        for (int i : randomNumbers)
            sum += i;
        System.out.println("The sum is " + sum);

    }
}
