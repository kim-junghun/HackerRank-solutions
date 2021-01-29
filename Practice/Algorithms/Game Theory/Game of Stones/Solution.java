// https://www.hackerrank.com/challenges/game-of-stones-1/problem

import java.util.Scanner;

public class Solution {

    static String gameOfStones(int n) {
        if (n % 7 < 2) {
            return "Second";
        } else {
            return "First";
        }
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for (int tItr = 0; tItr < t; tItr++) {
            int n = in.nextInt();
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = gameOfStones(n);

            System.out.println(result);            
        }

        in.close();
    }
}
