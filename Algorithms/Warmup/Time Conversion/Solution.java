// https://www.hackerrank.com/challenges/time-conversion/problem

import java.util.Scanner;

public class Solution {

    static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));        
        if (s.endsWith("AM")) {
            if (hour == 12) {
                hour = 0;
            }            
        } else {
            if (hour != 12) {
                hour = hour + 12;
            }        
        }                
        
        return String.format("%02d", hour) + s.substring(2, 8);
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        String result = timeConversion(s);

        System.out.println(result);

        in.close();
    }
}