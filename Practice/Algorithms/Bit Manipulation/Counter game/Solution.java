// https://www.hackerrank.com/challenges/counter-game/problem

import java.util.Scanner;

public class Solution {

    static String counterGame(long n) {

        int count = 0;

        String binary = Long.toBinaryString(n);
        char[] chars = binary.toCharArray();
        
        boolean trailing = true; 
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '1') {
                trailing = false;
                count++;
            } else if (trailing && chars[i] == '0') {
                count++;
            }
        }
        count--;

        if (count % 2 == 0) {
            return "Richard";
        } else {
            return "Louise";
        }
    }

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            long n = in.nextLong();
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = counterGame(n);

            System.out.println(result);
        }

        in.close();
    }
}