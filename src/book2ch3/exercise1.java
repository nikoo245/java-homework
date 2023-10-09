package book2ch3;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter a, b and c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("The equation has no root");
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has 1 root:" + root);
        }
        else {
            double root1 = (-b + Math.pow(d, 0.5)) / (2 * a);
            double root2 = (-b - Math.pow(d, 0.5)) / (2 * a);
            System.out.println("The equation has 2 roots: " + root1 + ", " + root2);
        }
    }
}
