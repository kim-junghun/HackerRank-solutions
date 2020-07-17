// https://www.hackerrank.com/challenges/apple-and-orange/problem

import java.util.Arrays;
import java.util.stream.*;
import java.util.Scanner;

public class Solution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        System.out.println(String.valueOf(
            Arrays.stream(apples).map(it -> {
                return a + it;
            }).filter(it -> {
                return (s <= it) && (it <= t);
            }).count()
        ));

        System.out.println(String.valueOf(
            Arrays.stream(oranges).map(it -> {
                return b + it;
            }).filter(it -> {
                return (s <= it) && (it <= t);
            }).count()
        ));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] st = in.nextLine().split(" ");
        
        int s = Integer.parseInt(st[0]);
        int t = Integer.parseInt(st[1]);

        String[] ab = in.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        String[] mn = in.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] appleItems = in.nextLine().split(" ");
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int appleItem = Integer.parseInt(appleItems[i]);
            apples[i] = appleItem;
        }

        int[] oranges = new int[n];

        String[] orangeItems = in.nextLine().split(" ");
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangeItem = Integer.parseInt(orangeItems[i]);
            oranges[i] = orangeItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        in.close();
    }   
}