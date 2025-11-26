package Recursion1;

public class countDigit {
    public static void main(String args[]){
        /*
        Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.

        A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
        Digits of n should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined.
        
        */

        
        int n = 12345;
        System.out.println(countDigits(n));
    }

    public static int countDigits(int n){
        if(n==0){
            return 0;
        }
        return 1 + countDigits(n/10);
    }
}
