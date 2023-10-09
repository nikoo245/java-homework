package book2ch2;

import java.util.Scanner;

public class homework218 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("a\tb\tpow(a, b");
        for (int a = 1; a < 6; a++) {
            System.out.println(a + "\t" + (a + 1) + "\t" + (int) Math.pow(a, a + 1));
        }
        }
}
