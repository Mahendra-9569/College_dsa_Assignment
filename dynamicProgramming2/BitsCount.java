package dynamicProgramming2;

public class BitsCount {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            count += Integer.bitCount(i);
        }
        System.out.println(count);
    }
}
