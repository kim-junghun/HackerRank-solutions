// https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem

import java.util.Scanner;

public class Solution {

    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int pos = 0;

        while (true) {
            pos = (pos + k) % c.length;
            energy = c[pos] == 0 ? energy - 1 : energy - 3;
            if (pos == 0) { break; }
        }

        return energy;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String[] nk = in.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = in.nextLine().split(" ");
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);

        System.out.println(String.valueOf(result));

        in.close();
    }
    
}