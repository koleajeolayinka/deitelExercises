public class CurrentMinuteAndSeconds {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinute = totalSeconds / 60;
        long currentMinute = totalMinute % 60;

        System.out.println("current minute is: " + currentMinute);
        System.out.println("current seconds is: " + currentSecond);

    }
}
