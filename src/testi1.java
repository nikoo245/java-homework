import java.io.*;
import java.util.Scanner;

class GFG {
    static Scanner s = new Scanner (System.in);
    static final double PI = Math.PI;
    static double Perimeter(double r)
    {
        return 2 * PI * r;
    }

    public static void main(String[] args)
    {

        System.out.println("enter radius: ");
        double r;
        r = s.nextInt();

        System.out.println("Perimeter of the circle is :"
                + Perimeter(r));
    }
}