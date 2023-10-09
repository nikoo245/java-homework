import java.util.Scanner;

public class homework26 {
    public static void main(String[] args) {
        System.out.println("enter a number between 0 and 1000; ");
        int number, digit_sum = 0;
        Scanner scanner = new Scanner (System.in);
        number = scanner.nextInt();
        int rem = number % 10;
        digit_sum += rem;

        number /= 10;
        rem = number % 10;
        digit_sum += rem;

        number /= 10;
        rem = number % 10;
        digit_sum += rem;
        System.out.println(digit_sum);
    }
}
