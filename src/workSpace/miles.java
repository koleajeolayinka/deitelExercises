package workSpace;

public class miles {
    public static void main(String [] args){
        double miles = 100;
        final double KilometersPerMile = 1.609;
        double  kilometers = miles * KilometersPerMile;
        System.out.println(kilometers);

        double step = kilometers * 4;
        System.out.println(step);

    }
}
