package book2ch2;

import java.util.Scanner;

public class homework221 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double noy, ia, mir, fiv;
        System.out.println("Enter investment amount: ");
        ia = scanner.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        mir = scanner.nextDouble();
        System.out.println("Enter number of years: ");
        noy = scanner.nextDouble();
        fiv = ia * (Math.pow((1 + mir), (noy * 12)));
        System.out.println("Accumulated value is: " + fiv);
    }
}
