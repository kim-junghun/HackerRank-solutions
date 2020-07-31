// https://www.hackerrank.com/challenges/java-anagrams/problem

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        final int NO_OF_ALPHABET = 26;

        if (a.length() != b.length()) {
            return false;
        }

        int[] freq = new int[NO_OF_ALPHABET];

        String first = a.toUpperCase();
        String second = b.toUpperCase();

        for (int i = 0; i < a.length(); i++) {
            freq[first.charAt(i) - 65]++;
            freq[second.charAt(i) - 65]--;
        }

        for (int i = 0; i < NO_OF_ALPHABET; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String a = in.next();
        String b = in.next();

        in.close();

        boolean ret = isAnagram(a, b);

        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    
}