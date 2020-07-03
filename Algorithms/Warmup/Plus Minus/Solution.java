// https://www.hackerrank.com/challenges/plus-minus/problem

import java.util.List;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Solution {

    static void plusMinus(int[] arr) {
        int count = arr.length;        
        int posOccur = 0;
        int negOccur = 0;
        int zeroOccur = 0;

        for (int i : arr) {
            if (i > 0) {
                posOccur += 1;
            } else if (i < 0) {
                negOccur += 1;
            } else {
                zeroOccur += 1;
            }
        }

        float posRatio = (float)posOccur / count;
        float negRatio = (float)negOccur / count;
        float zeroRatio = (float)zeroOccur / count;

        System.out.println(String.format("%.6f", posRatio));
        System.out.println(String.format("%.6f", negRatio));
        System.out.println(String.format("%.6f", zeroRatio));
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = Integer.parseInt(in.nextLine().trim());

        int[] arr = new int[count];

        List<Integer> aList = Stream.of(in.nextLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(Collectors.toList());
        
        for (int i = 0; i < count; i++) {
            arr[i] = aList.get(i);
        }

        plusMinus(arr);
        
        in.close();        
    }
}