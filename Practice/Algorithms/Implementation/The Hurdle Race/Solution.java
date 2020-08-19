// https://www.hackerrank.com/challenges/the-hurdle-race/problem

import java.util.Scanner;
import java.util.stream.*;
import java.util.Arrays;

public class Solution {

    static int hurdleRace(int k, int[] height) {
        int max = Arrays.stream(height).max().orElse(0);
        
        return k >= max ? 0 : max - k;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String[] nk = in.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] height = new int[n];

        String[] heightItems = in.nextLine().split(" ");
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightItems[i]);
            height[i] = heightItem;
        }

        int result = hurdleRace(k, height);

        System.out.println(String.valueOf(result);        

        in.close();
    }
}