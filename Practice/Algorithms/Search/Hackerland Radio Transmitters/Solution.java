// https://www.hackerrank.com/challenges/hackerland-radio-transmitters/problem

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static int hackerlandRadioTransmitters(int[] x, int k) {
        int result = 0;

        Arrays.sort(x);
        int i = 0;

        while (i < x.length) {
            int cover = x[i] + k;
            while (i < x.length && x[i] <= cover) {
                i++;
            }

            i--;
            result++;

            cover = x[i] + k;
            while (i < x.length && x[i] <= cover) {
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String[] nk = in.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] x = new int[n];

        String[] xItems = in.nextLine().split(" ");
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int xItem = Integer.parseInt(xItems[i]);
            x[i] = xItem;
        }

        int result = hackerlandRadioTransmitters(x, k);

        System.out.println(String.valueOf(result));

        in.close();
    }
    
}
