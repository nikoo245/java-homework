import java.util.Scanner;

public class homework214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m, kg, how;
        System.out.println("Enter your weight in kilograms: ");
        kg = scanner.nextDouble();
        System.out.println("Enter your height in meters: ");
        m = scanner.nextDouble();
        how = kg / Math.pow(m, 2);
        System.out.println("Bmi is: " + how);
    }
}
