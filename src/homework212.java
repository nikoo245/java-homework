import java.util.Scanner;

public class homework212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double v, a, l;
        System.out.println("Enter speed and acceleration: ");
        v = scanner.nextDouble();
        a = scanner.nextDouble();
        l = Math.pow(v, 2) / (a * 2);
        System.out.println(" The minimum runway length for this airplane is: " + l );
    }
}
