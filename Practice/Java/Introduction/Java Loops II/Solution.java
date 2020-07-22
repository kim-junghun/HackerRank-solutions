// https://www.hackerrank.com/challenges/java-loops/problem

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;
import java.util.Scanner;

public class Solution {

    public static int[] javaLoopsII(int a, int b, int n) {
        AtomicInteger index = new AtomicInteger();                
        return IntStream.iterate(a + b, it -> it + (int) Math.pow(2, index.incrementAndGet()) * b)
                        .limit(n)
                        .toArray();                 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int[] arr = javaLoopsII(a, b, n);

            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]);
                if (j != arr.length - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(System.lineSeparator());
                }
            }
        }
        in.close();
    }

}