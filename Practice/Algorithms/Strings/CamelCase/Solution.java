// https://www.hackerrank.com/challenges/camelcase/problem

import java.util.Scanner;

public class Solution {

    static int camelcase(String s) {
        
        long result = s.chars().filter(e -> {
            if (65 <=  e && e <= 90) {
                return true;
            } else {
                return false;
            }
        }).count() + 1;

        return Math.toIntExact(result);        
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        int result = camelcase(s);

        System.out.println(String.valueOf(result));
        
        in.close();   
    }
}