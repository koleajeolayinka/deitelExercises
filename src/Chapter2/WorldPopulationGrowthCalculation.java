package Chapter2;


import java.math.BigInteger;
//2.34 (World Population Growth Calculator) Search the Internet to determine the current world
//        population and the annual world population growth rate. Write an application that inputs these val-
//        ues, then displays the estimated world population after one, two, three, four and five years.
public class WorldPopulationGrowthCalculation {
    public static void main(String[] args) {
        BigInteger CurrentPopulation = new BigInteger("7900000000");
        BigInteger increasePerYear = BigInteger.valueOf(84506376);
        System.out.println("\tWELCOME TO THE WORLD POPULATION CALCULATION\n\t\tTHAT ESTIMATE THE NEXT POPULATION IN NEXT 5 YEARS ");
        System.out.println("CURRENT WORLD POPULATION IS 7.9BILLION IN 2022");
        System.out.println("ESTIMATE THE POPULATION IN THE NEXT FIVE YEARS");
        for (int i = 0; i < 19; i++) {
            System.out.print("==");
        }
        BigInteger calPo = CurrentPopulation.add(increasePerYear);
        BigInteger population1 = calPo.add(BigInteger.valueOf(202413));
        BigInteger population2 = population1.add(BigInteger.valueOf(202413));
        BigInteger population3 = population2.add(BigInteger.valueOf(202413));
        BigInteger population4 = population3.add(BigInteger.valueOf(202413));
        BigInteger population5 = population4.add(BigInteger.valueOf(202413));
        System.out.printf("%n%s       %7s       %5s%n", "YEAR" , "POPULATION", "PERCENTAGE");
        System.out.printf("%d%17d%17.4f%n", 2023 , population1,1.069673555 );
        System.out.printf("%d%17d%17.4f%n", 2024 , population2, 1.069646149);
        System.out.printf("%d%17d%17.4f%n", 2025 , population3, 1.069618745);
        System.out.printf("%d%17d%17.4f%n", 2026 , population4, 1.069591342);
        System.out.printf("%d%17d%17.4f%n", 2027 , population5, 1.069563941);
        for (int i = 0; i < 19; i++) {
            System.out.print("==");
        }
    }
}
