import java.sql.SQLOutput;
import java.util.Scanner;

public class homework25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double subtotal, gratuity, total;
        subtotal = scanner.nextDouble();
        gratuity = scanner.nextDouble();
        total = subtotal +(subtotal * gratuity / 100.0);
        System.out.println("the gratuity is $" + (gratuity / 10) + " and total is $" + total);


    }
}
