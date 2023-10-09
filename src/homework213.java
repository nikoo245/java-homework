import java.util.Scanner;

public class homework213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saved, balance = 0, rate = 1 + 0.05 / 12;

        System.out.print("Enter the monthly saving amount: ");
        saved = scanner.nextDouble();

        for (int i = 1; i < 7; i++)
            balance = (balance + saved) * rate;

        System.out.println("After the sixth month, the account value is $" + balance);;
    }
}
