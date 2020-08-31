// https://www.hackerrank.com/challenges/extra-long-factorials/problem

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    static void extraLongFactorials(int n) {
        if (n < 2) {
            System.out.println("1");
            return;
        }

        BigInteger result = BigInteger.valueOf(1);
        for (int i = n; i > 1; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        in.close();
    }
    
}