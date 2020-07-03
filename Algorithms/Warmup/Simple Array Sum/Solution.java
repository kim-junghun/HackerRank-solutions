// https://www.hackerrank.com/challenges/simple-array-sum/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int sum = 0;
        
        for (int i = 0; i < count; i++) {
            sum += in.nextInt();
        }

        System.out.println(sum);

        in.close();
    }
}