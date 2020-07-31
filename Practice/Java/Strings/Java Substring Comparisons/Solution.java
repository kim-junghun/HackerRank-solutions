// https://www.hackerrank.com/challenges/java-string-compare/problem

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;
import java.util.stream.Collectors;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        /*
        String[] sorted = IntStream.range(0, s.length() - k + 1)
                                   .mapToObj(it -> {
                                       return s.substring(it, it + k);
                                   })
                                   .sorted()
                                   .toArray(String[]::new);

        return String.format("%s\n%s", sorted[0], sorted[sorted.length - 1]);
        */
        String smallest = "";
        String largest = "";
        
        for (int i = 0; i < s.length() - k + 1; i++){
            if (i == 0) {
                smallest = s.substring(i, i + k);
                largest = s.substring(i, i + k);
                continue;
            }
            if (smallest.compareTo(s.substring(i, i + k)) > 0) {
                smallest = s.substring(i, i + k);
            }
            if (largest.compareTo(s.substring(i, i + k)) < 0) {
                largest = s.substring(i, i + k);
            }
        }

        return String.format("%s\n%s", smallest, largest);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();
        int k = in.nextInt();

        String result = getSmallestAndLargest(s, k);

        System.out.println(result);

        in.close();
    }
}