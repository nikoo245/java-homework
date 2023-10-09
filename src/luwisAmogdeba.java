import java.util.Scanner;

public class luwisAmogdeba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the number: ");
        String number = scanner.next();

        String result = "";

        for (int i = 0; i < number.length(); i++)
        if (Integer.parseInt(""+number.charAt(i)) % 2 != 0)
                result += number.charAt(i);
        System.out.println(result);

    }
}
