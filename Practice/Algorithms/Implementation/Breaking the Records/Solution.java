// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

import java.util.Scanner;

public class Solution {

    static int[] breakingRecords(int[] scores) {
        int min = Integer.MAX_VALUE;
        int max = -1;

        int breakMin = -1;
        int breakMax = -1;
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
                breakMax++;
            }
            if (scores[i] < min) {
                min = scores[i];
                breakMin++;
            }
        }

        int[] result = new int[2];
        result[0] = breakMax;
        result[1] = breakMin;

        return result;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = in.nextLine().split(" ");
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.print(System.lineSeparator());

        in.close();
    }
}