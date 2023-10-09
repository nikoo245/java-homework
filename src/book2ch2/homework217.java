package book2ch2;

import java.util.Scanner;

public class homework217 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double twc, v, ta;
        System.out.println(" Enter the temperature in Fahrenheit betweeen -58 and 41: ");
        ta = scanner.nextDouble();
        System.out.println("Enter thw wind speed (>=2) in mph: ");
        v = scanner.nextDouble();
        twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);
        System.out.println("the wind chill index is: " + twc);
    }
}
