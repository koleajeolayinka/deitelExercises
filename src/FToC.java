import java.util.Scanner;

public class FToC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a degree in fahrenheit: ");
        double f = scanner.nextDouble();

        double celsius = (5.0/9.) * (f - 32);
        System.out.println("Fahrenheit " + f  + " is " + celsius + " in celsius");

    }

}