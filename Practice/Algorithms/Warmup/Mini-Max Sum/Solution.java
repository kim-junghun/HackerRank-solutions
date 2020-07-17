// https://www.hackerrank.com/challenges/mini-max-sum/problem

import java.util.Scanner;

public class Solution {

    static void miniMaxSum(int[] arr) {
        long tot = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i : arr) {
            tot += i;
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        System.out.print(tot - max);
        System.out.print(" ");
        System.out.println(tot - min);
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        String[] arrItems = in.nextLine().split(" ");
        // in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        in.close();
    }
}