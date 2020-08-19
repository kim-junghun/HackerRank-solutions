// https://www.hackerrank.com/challenges/utopian-tree/problem

import java.util.Scanner;

public class Solution {

    static int utopianTree(int n) {        
        return (int) Math.pow(2, (n + 1) / 2 + 1) - 1 - (n % 2);
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = in.nextInt();            
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = utopianTree(n);
            
            System.out.println(String.valueOf(result));            
        }        

        in.close();
    }
}