import java.util.Scanner;

public class homework211 {
    public static void main(String[] args) {
        Scanner sccanner = new Scanner (System.in);
        int years, population;

        System.out.print("Enter the number of years: ");
        years = sccanner.nextInt();

        population = 312032486 + years * (365 * 24 * 60 * 60 / 7 - 365 * 24 * 60 * 60 / 13 + 365 * 24 * 60 * 60 / 45);

        System.out.printf("The population in %d years is %d", years, population);

    }
}
