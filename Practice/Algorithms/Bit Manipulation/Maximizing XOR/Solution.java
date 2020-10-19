// https://www.hackerrank.com/challenges/maximizing-xor/problem

import java.util.Scanner;

public class Solution {

    static int maximizingXor(int l, int r) {
        int xored = l ^ r;
        String binary = Integer.toBinaryString(xored);

        return (int) Math.pow(2, binary.length()) - 1;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int l = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int r = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = maximizingXor(l, r);

        System.out.println(String.valueOf(result));

        in.close();
    }
}
