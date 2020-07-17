// https://www.hackerrank.com/challenges/java-if-else/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (N <= 5) {
                System.out.println("Not Weird");
            } else if (N <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }

        in.close();
    }
}