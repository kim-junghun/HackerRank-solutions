// https://www.hackerrank.com/challenges/staircase/problem

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static void staircase(int n) {
        /*
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n - i - 1 > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.print(System.lineSeparator());
        }
        */
        char[] stair = new char[n];
        Arrays.fill(stair, ' ');

        for (int i = 0; i < n; i++) {
            stair[n - i - 1] = '#';
            System.out.println(stair);
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(count);

        in.close();
    }
}