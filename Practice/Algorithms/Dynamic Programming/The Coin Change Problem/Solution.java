// https://www.hackerrank.com/challenges/coin-change/problem

import java.util.List;
import java.util.Scanner;
import java.util.stream.*;
import java.util.stream.Collectors;

public class Solution {

    static long getWays(int n, List<Long> c) {
        
        long[] ways = new long[n + 1];
        ways[0] = 1;
        /*
        for (int i = 0; i < c.size(); i++) {
            for (long j = c.get(i); j <= n; j++) {
                if (ways[(int)(j - c.get(i))] > 0) {
                    ways[(int)j] = ways[(int)j] + ways[(int)(j - c.get(i))];
                }
            }
        }
        */

        for (int i = 0; i < c.size(); i++) {
            for (int j = 1; j < ways.length; j++) {
                if (j >= c.get(i)) {
                    ways[j] = ways[j] + ways[(int)(j - c.get(i))];
                }
            }
        }
        

        return ways[n];
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String[] firstMultipleInput = in.nextLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Long> c = Stream.of(in.nextLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(Collectors.toList());

        long ways = getWays(n, c);

        System.out.println(String.valueOf(ways));

        in.close();
    }
}