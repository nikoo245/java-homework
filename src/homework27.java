import java.util.Scanner;

public class homework27 {
    public static void main(String[] args) {
        int minutes, years, days;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter number of minutes: ");
        minutes = scanner.nextInt();
        days = minutes / 60 / 24;
        System.out.println(minutes + " minutes is aproximately  " + (days / 365) + "years and " + ( days % 365) + " days");
    }
}
