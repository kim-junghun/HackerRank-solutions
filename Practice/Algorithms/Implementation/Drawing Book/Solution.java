// https://www.hackerrank.com/challenges/drawing-book/problem

import java.util.Scanner;

public class Solution {

    static int pageCount(int n, int p) {
        int result = p / 2;
        int toLast = n / 2;
        
        if (toLast / 2 < result) {
            result = toLast - result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();        
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int p = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = pageCount(n, p);

        System.out.println(String.valueOf(result));

        in.close();
    }    
}