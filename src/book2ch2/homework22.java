package book2ch2;

import java.util.Scanner;

public class homework22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
double r, l;
        System.out.println("Enter the radius and length of a cylinder: " );
        r = scanner.nextDouble();
        l = scanner.nextDouble();

        System.out.println("The area is: " + r * r * 3.14159);
        System.out.println("the volume is: " + (r * r * 3.14159) * l );
    }
}
