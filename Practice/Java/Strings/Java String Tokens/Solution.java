// https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        in.close();

        String[] tokens = s.split("[\\s!,?._'@]+");

        int length = tokens.length;

        if (length == 0) {
            System.out.println(String.valueOf(length));
            return;    
        }

        if (tokens[0].length() == 0) {
            length--;
        }

        System.out.println(String.valueOf(length));
        for (String str : tokens) {
            if (str.length() > 0) {
                System.out.println(str);
            }
        }
    }
}