public class testi3 {
    public static void main(String[] args) {

    }
        public static void twoLuckyNumbers() {
            for (int i = 10; i < 1000; i++)
                for (int j = 10; j < 1000; j++)
                    if ((i * 100 + j) % (i * j) == 0)
                        System.out.println(i + " " + j);
        }

}
