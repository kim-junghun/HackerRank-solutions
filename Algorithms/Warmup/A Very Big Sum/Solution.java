// https://www.hackerrank.com/challenges/a-very-big-sum/problem

import java.util.stream.*;
import java.util.Scanner;
import java.util.List;

import java.util.stream.Collectors;

public class Solution {

    static long aVeryBigSum(long[] ar) {
        long result = 0;

        for (int i = 0; i < ar.length; i++) {
            result += ar[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] ar = new long[count];

        String a = in.nextLine();
                        
        List<Long> aList = Stream.of(a.replaceAll("\\s+$", "").split(" "))
                            .map(Long::parseLong)
                            .collect(Collectors.toList());

        for (int i = 0; i < count; i++) {
            ar[i] = aList.get(i);
        }

        long result = aVeryBigSum(ar);

        System.out.println(String.valueOf(result));
        
        in.close();
    }
}