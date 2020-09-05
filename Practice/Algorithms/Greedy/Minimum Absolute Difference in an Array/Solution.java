// https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static int minimumAbsoluteDifference(int[] arr) {
        int result = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) < result) {
                result = Math.abs(arr[i] - arr[i + 1]);
            }
        }

        return result;        
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = in.nextLine().split(" ");
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = minimumAbsoluteDifference(arr);

        System.out.println(String.valueOf(result));


        in.close();
    }
    
}
