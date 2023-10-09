import java.util.Scanner;

public class urtiertmartivi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter p and q: ");
        int p = scanner.nextInt();
        int q = scanner.nextInt();

        System.out.println("result: ");
        for (int i = 2; i < p; i++){
            if (p % i == 0 && q % i == 0)
                System.out.println(i + " ");
        }
        System.out.println();
    }
}
