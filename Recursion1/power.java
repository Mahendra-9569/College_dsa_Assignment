package Recursion1;

public class power {
    public static void main(String args[]){
        /*
        Given a number n, find the value of n raised to the power of its own reverse.
        Note: The result will always fit into a 32-bit signed integer.
        Input: n = 2
        Output: 4
        Explanation: The reverse of 2 is 2, and 22 = 4.
        */


        int x = 2;
        int n = 5;
        int result = power(x, n);
        System.out.println(result);
       }

        public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x, n - 1);
    }
}
