import org.jetbrains.annotations.Contract;

public class testi2 {

        @Contract(pure = true)
        public static double mean (int[] numbers){
            int total = 0;
            int cnt = 0;
            for (int i = 0; i < numbers.length; i += 2) {
                total += numbers[i];
                cnt++;
            }
            return total / (double) cnt;
        }

    public static void main(String[] args) {
    }
}
