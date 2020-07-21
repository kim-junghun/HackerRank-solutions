// https://www.hackerrank.com/challenges/java-loops-i/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", N, i, N * i));
        }

        in.close();
    }
}