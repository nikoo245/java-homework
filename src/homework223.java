import java.util.Scanner;

public class homework223 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double distance, mpg, gallon_price, total_cost;
        System.out.println("enter distance: ");
        distance = scanner.nextDouble();

        System.out.println(" enter miles per gallon: ");
        mpg = scanner.nextDouble();

        System.out.println( " enter price per gallon: ");
       gallon_price = scanner.nextDouble();

        System.out.println(" total cost is: " + ((distance / mpg) *  gallon_price));
    }
}
