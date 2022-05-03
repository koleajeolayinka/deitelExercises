package Chapter2;


//2.35 (Statistics for the Great Pyramid of Giza) The Great Pyramid of Giza is considered an
//        engineering marvel of its time. Use the web to get statistics related to the Great Pyramid of Giza, and
//        find the estimated number of stones used to build it, the average weight of each stone, and the num-
//        ber of years it took to build. Create an application that calculates an estimate of how much, by
//        weight, of the pyramid was built each year, each hour, and each minute as it was being built. The
//        application should input the following information:
//        a) Estimated number of stones used.2.3 million stones
//        b) Average weight of each stone.
//        c) Number of years taken to build the pyramid (assuming a year comprises 365 days).
public class StatisticsForTheGreatPyramidOfGiza {
    public static void main(String[] args) {
        System.out.println("\tWELCOME TO STATISTICS FOR THE GREAT PYRAMID OF GIZA");
int numberOfStone = 2300000;
double averageWeight =  2.3;
int numberOfYears = 5;
        System.out.println("THE PYRAMID USES " + numberOfStone + " TO BUILD");
        System.out.println("AVERAGE WEIGHT " + averageWeight + "TONES");
        System.out.println("TAKES " + numberOfYears + " YEARS");
    }
}
