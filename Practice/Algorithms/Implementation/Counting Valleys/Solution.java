// https://www.hackerrank.com/challenges/counting-valleys/problem

import java.util.Scanner;

public class Solution {

    static int countingValleys(int n, String s) {
        int result = 0;
        int altitude = 0;

        for (int i = 0; i < s.length(); i++) {
            char step = s.charAt(i);
            if (step == 'U') {
                if (++altitude == 0) {
                    result++;
                }
            } else {
                --altitude;
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = in.nextLine();

        int result = countingValleys(n, s);

        System.out.println(String.valueOf(result));

        in.close();
    }
}