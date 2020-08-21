// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

import java.util.Scanner;

public class Solution {

    static int reverseNumber(int i) {
        int num = i;
        int result = 0;
        
        while (num != 0) {
            int digit = num % 10;
            result = result * 10 + digit;
            num = num / 10;
        }

        return result;
    }

    static int beautifulDays(int i, int j, int k) {
        int result = 0;

        for (int iter = i; iter <= j; iter++) {
            if (Math.abs(iter - reverseNumber(iter)) % k == 0) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] ijk = in.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);        

        System.out.println(String.valueOf(result));

        in.close();
        
    }
}