import java.util.Scanner;

public class homework215 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, length;
        Scanner scanner = new Scanner (System.in);


        System.out.print(" Enter x1 and y1: ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();

        System.out.print( " Enter x2 and y2: ");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println( " The distance between the two points is: " + length);


    }
}
