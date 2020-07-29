// https://www.hackerrank.com/challenges/electronics-shop/problem

import java.util.stream.*;
import java.util.Scanner;

public class Solution {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int result = -1;
        
        for (int keyboard : keyboards) {
            if (keyboard >= b) {
                continue;
            }
            for (int drive : drives) {
                int sum = keyboard + drive;
                if (sum <= b && sum > result) {
                    result = sum;
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] bnm = in.nextLine().split(" ");
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = Stream.of(in.nextLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();
        
        int[] drives = Stream.of(in.nextLine().split(" "))
                             .mapToInt(Integer::parseInt)
                             .toArray();
        
        int moneySpent = getMoneySpent(keyboards, drives, b);

        System.out.println(String.valueOf(moneySpent));

        in.close();
    }
}