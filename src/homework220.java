import java.util.Scanner;

public class homework220 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double i, air, b;
        System.out.println("Enter balance and interest rate: ");
        b = scanner.nextDouble();
        air = scanner.nextDouble();
        i = b * (air  / 120);
        System.out.println("The interest rate is: " + i);
    }
}
