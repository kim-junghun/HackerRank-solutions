// https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem

import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Solution {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] result = new int[alice.length];

        List<Integer> list = Arrays.stream(scores).distinct().sorted().mapToObj(i -> i).collect(Collectors.toList());

        for (int i = 0; i < alice.length; i++) {
            /*
            for (int j = 0; j < list.size(); j++) {
                if (alice[i] < list.get(j)) {
                    result[i] = list.size() + 1 - j;
                    break;
                } else {
                    list.remove(0);
                    j--;                    
                }
            }
            if (result[i] == 0) {
                result[i] = 1;
            }
            */
            while (!list.isEmpty()) {
                if (alice[i] < list.get(0)) {
                    result[i] = list.size() + 1;
                    break;
                }
                list.remove(0);
            }
            if (result[i] == 0) {
                result[i] = 1;
            }            
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int scoresCount = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = in.nextLine().split(" ");
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = in.nextLine().split(" ");
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            System.out.println(String.valueOf(result[i]));
        }

        in.close();
    }
}