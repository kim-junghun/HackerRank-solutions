// https://www.hackerrank.com/challenges/java-strings-introduction/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String A = in.next();
        String B = in.next();

        System.out.println(String.valueOf(A.length() + B.length()));

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(String.format("%s %s", A, B));
    }
}