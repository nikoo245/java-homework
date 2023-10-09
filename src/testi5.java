public class testi5 {
    public static void main(String[] args) {
    }
    public static boolean isPalindrome(int number) {
        int reversed = 0, num = number;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed == num;
    }

}
