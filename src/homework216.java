import java.util.Scanner;

public class homework216 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s, h;
        System.out.println("Enter the side: ");
        s = scanner.nextDouble();
        h = (((Math.sqrt(3) * 3) / 2) * Math.pow(s, 2));
        System.out.println("The area of the hexagon is: " + h);
    }
}
