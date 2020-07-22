// https://www.hackerrank.com/challenges/java-datatypes/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = in.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) { System.out.println("* byte"); }
                if (x >= -32768 && x <= 32767) { System.out.println("* short"); }
                if (x >= Math.pow(-2, 31) && x <= Math.pow(2, 31) - 1) { System.out.println("* int"); }
                if (x >= Math.pow(-2, 63) && x <= Math.pow(2, 63) - 1) { System.out.println("* long"); }

            } catch (Exception e) {
                System.out.println(in.next() + " can't be fitted anywhere.");
            }
        }
        
        in.close();
    }
}