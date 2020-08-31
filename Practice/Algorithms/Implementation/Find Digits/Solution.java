// https://www.hackerrank.com/challenges/find-digits/problem

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    static int findDigits(int n) {
        int result = 0;
        List<Integer> list = new ArrayList<Integer>();
        int i = n;

        while (i != 0) {
            list.add(i % 10);
            i = i / 10;
        }

        for (int iter : list) {
            if (iter == 0) { continue; }
            if (n % iter == 0) { result++; }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = in.nextInt();
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

            System.out.println(String.valueOf(result));
        }

        in.close();
    }
    
}