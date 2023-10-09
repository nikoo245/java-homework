package book2ch2;

import java.util.Scanner;

public class homework24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
double p, kg;
        System.out.println(" Enter a number in pounds: ");
        p = scanner.nextDouble();
        kg = p * 0.454;

        System.out.println( + p + "pounds is: " + kg + "kilograms: ");

    }
}
