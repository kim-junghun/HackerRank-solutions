// https://www.hackerrank.com/challenges/append-and-delete/problem

import java.util.Scanner;

public class Solution {

    static String appendAndDelete(String s, String t, int k) {
        int index = 0;
        
        for (int i = 0; i < s.length() && i < t.length(); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                index++;
            } else {
                break;
            }
        }
        
        // delete completely and append
        if (k >= s.length() + t.length()) {
            return "Yes";
            
        }

        // same text
        if (s.length() == t.length()) {
            if (index == s.length()) {
                if (k % 2 == 0 || k >= 2 * s.length()) {
                    return "Yes";
                }
                else {
                    return "No";
                }
            }
        }

        // substring
        if (Math.min(s.length(), t.length()) == index) {
            if (Math.abs(s.length() - t.length()) <= k
                && (s.length() - t.length() - k) % 2 == 0) {
                return "Yes";
            } else {
                return "No";
            }
        }

        if ((s.length() + t.length()) - 2 * index <= k
            && (s.length() - t.length() - k) % 2 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        String t = in.nextLine();

        int k = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        System.out.println(result);

        in.close();
    }
    
}