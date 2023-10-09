package book2ch2;

import java.util.Scanner;

public class homework219 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
double s, s1, s2, s3, a;
        System.out.println("Enter three points of a triangle: ");
        s1 = scanner.nextDouble();
        s2 = scanner.nextDouble();
        s3 = scanner.nextDouble();
        s = (s1 + s2 + s3) / 2;
        a = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        System.out.println("The area of the triangle is: " + a);



    }

}
