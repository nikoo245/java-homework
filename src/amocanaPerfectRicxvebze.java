import java.util.Scanner;

public class amocanaPerfectRicxvebze
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter range n(inclusive) and m(exclusive): ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int sum = 0;

        for (int i = n; i < m; i++) {

            if (i == 0) continue;

            for (int j = 1; j < i; j++)
                if (i % j == 0) sum += j;

            if (sum == i)
                System.out.println(i + " ");

            sum = 0;
        }
        }
    }
