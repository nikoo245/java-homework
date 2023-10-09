import java.util.Scanner;

public class homework21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a degree in celsius: ");
        double celsius =  scanner.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.print(celsius + " celsius is " +fahrenheit + " fahrenheit") ;
    }
}