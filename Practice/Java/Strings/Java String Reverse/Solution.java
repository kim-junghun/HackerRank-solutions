// https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.util.Scanner;

public class Solution {

    static String isPalindrome(String str) {
        for (int i = 0; i < (str.length() + 1) / 2; i++) {

            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.next();

        String result = isPalindrome(A);

        System.out.println(result);

        in.close();
    }    
}