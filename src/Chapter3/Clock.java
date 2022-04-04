package Chapter3;

public class Clock {
    static int Second;
    int Hour;
    static int Minute;

    public Clock(int hour, int minute, int second) {
    this.Hour = hour;
    this.Minute = minute;
    this.Second = second;
    }

    public static int getMinute() {
        return Minute;
    }

    public static int getSecond() {
        return Second;
    }

    public int getHour() {
        return Hour;
    }

    public String getHourExceedValue() {
        String hh = String.valueOf(Hour);
        if (Hour > 23) {
            System.out.println("hh:mm:ss");
            hh = "hh:mm:ss";


        }
        return hh;
    }

    public String getMiuteExceedValue() {
        String mm = String.valueOf(Minute);
        if (Minute > 59) {
            System.out.println("hh:mm:ss");
            mm = "hh:mm:ss";

        }
        return mm;
    }

    public String getMinuteExceedValue() {

        String ss = String.valueOf(Second);
        if (Second > 59) {
            System.out.println("hh:mm:ss");
            ss = "hh:mm:ss";

        }
        return ss;
    }
}
