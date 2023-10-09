import java.util.Scanner;

public class homework210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double q, m, ft, it;
        System.out.println(" Enter the ammount of water in kilograms: ");
        m = scanner.nextDouble();
        System.out.println(" Enter the initial temperature: ");
        it = scanner.nextDouble();
        System.out.println("Enter findal temperature: ");
        ft = scanner.nextDouble();
        q = m * (ft - it) * 4184;
        System.out.println("The energy needed is: " + q );


    }
}
