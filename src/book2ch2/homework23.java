package book2ch2;

import java.util.Scanner;

public class homework23
{
    public static void main(String[] args) {
        double foot;
        Scanner scanner = new Scanner(System.in);
        System.out.print( " Enter a value for feet: ");
        double feet = scanner.nextDouble();
        double meter = feet * 0.305;
        System.out.println(feet + " feet is " + meter + " meters ");
    }
}
