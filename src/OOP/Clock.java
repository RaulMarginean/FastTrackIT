import java.security.PublicKey;

public class Clock {
    private int hour = 0;
    private int minute;

    public Clock() {
        System.out.println("Startiong to build a clock...");
        this.minute = 30;
    }

    public Clock(int hour, int minute) {
        System.out.println("Starting to build a custom clock...");
        this.hour = hour;
        this.minute = minute;
    }

    public String getTime() {
        return String.format("%d:%d", hour, minute);
    }

    public void setHour(int hour) {

        this.hour = hour % 24;

    }

    public void setMinute(int m) {
        minute = m;
    }
}
