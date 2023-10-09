import java.util.Scanner;

public class homework29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double v0, v1, t, a;
        System.out.println(" enter v0, v1 and t: ");
        v0 = scanner.nextDouble();
        v1 = scanner.nextDouble();
        t = scanner.nextDouble();
        a = (v1 - v0) / t;
        System.out.println(" The average acceleration is: " + a);


    }
}
