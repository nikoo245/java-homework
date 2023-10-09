import java.util.Scanner;

public class homework28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte offset;
        long totalMilliseconds = System.currentTimeMillis();

        System.out.print("Enter the time zone offset to GMT: ");
        offset = scanner.nextByte();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + offset) % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
