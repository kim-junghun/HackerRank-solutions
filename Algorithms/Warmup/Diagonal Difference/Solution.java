// https://www.hackerrank.com/challenges/diagonal-difference/problem

import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Solution {

    public static int diagocalDifference(List<List<Integer>> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> ar = arr.get(i);
            for (int j = 0; j < ar.size(); j++) {
                if (i == j) {                    
                    result += ar.get(j);
                }
                if (i + j == ar.size() - 1) {                    
                    result -= ar.get(j);
                }
            }
        }
        return Math.abs(result);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(it -> {
            arr.add(Stream.of(in.nextLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));
        });

        int result = diagocalDifference(arr);

        System.out.println(String.valueOf(result));

        in.close();
    }
}