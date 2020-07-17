// https://www.hackerrank.com/challenges/between-two-sets/problem

import java.util.List;
import java.util.Scanner;
import java.util.stream.*;
import java.util.stream.Collectors;

public class Solution {

    private static int gcd(int x, int y) {
        return (y == 0) ? x : gcd(y, x % y);
    }

    private static int getTotalX(List<Integer> a, List<Integer> b) {
        int lcmOfA = a.stream().reduce(1, (x, y) -> x * (y / gcd(x, y)));

        int minOfB = b.stream().min(Integer::compare).orElse(-1);        

        List<Integer> candidates = Stream.iterate(lcmOfA, it -> it + lcmOfA)
                                        .limit(minOfB / lcmOfA)
                                        .collect(Collectors.toList());
        
        int result = candidates.size();
        for (int candidate : candidates) {
            for (int i : b) {
                if (i % candidate != 0) {
                    result -= 1;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String[] firstMultipleInput = in.nextLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(in.nextLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        List<Integer> brr = Stream.of(in.nextLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int total = getTotalX(arr, brr);

        System.out.println(String.valueOf(total));

        in.close();
    }

}