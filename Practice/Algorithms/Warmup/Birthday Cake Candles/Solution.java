// https://www.hackerrank.com/challenges/birthday-cake-candles/problem

import java.util.Scanner;

public class Solution {

    static int birthdayCakeCandles(int[] ar) {
        int maxHeight = 0;
        int maxOccur = 0;

        for (int i : ar) {
            if (maxHeight < i) {
                maxHeight = i;
                maxOccur = 1;
            } else if (maxHeight == i) {
                maxOccur++;
            }
        }

        return maxOccur;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int arCount = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = in.nextLine().split(" ");
        // in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        System.out.println(String.valueOf(result));

        in.close();
    }
}