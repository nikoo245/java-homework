import java.util.Scanner;

public class dro300
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int totalmin, hrremain, minremain, h, m;
        System.out.println("Enter current time: ");
        h = scanner.nextInt();
        m = scanner.nextInt();
        totalmin = 180 - 60 * h - m;
        hrremain = totalmin / 60;
        minremain = totalmin % 60;
        System.out.println(hrremain + " hours and " + minremain + " minutes are remaining");

    }
}

