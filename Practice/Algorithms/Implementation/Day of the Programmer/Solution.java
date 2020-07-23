// https://www.hackerrank.com/challenges/day-of-the-programmer/problem

import java.util.Scanner;

public class Solution {

    static String dayOfProgrammer(int year) {

        int n = 256;
        int[] daysOfMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        boolean isLeapYear;
        boolean isJulian = year < 1919;

        if (isJulian) {
            isLeapYear = year % 4 == 0 ? true : false;
        } else {
            isLeapYear = ((year % 4 == 0) && (year % 100 != 0))
                      || (year % 400 == 0) ? true : false;
        }
        
        if (year == 1918) { daysOfMonth[2] -= 13; }
        if (isLeapYear) { daysOfMonth[2] += 1; }

        int month = 0;
        int day = 0;

        for (int i = 0; i < daysOfMonth.length; i++) {
            if (n < daysOfMonth[i]) {
                month = i;
                day = n;
                break;
            }
            n -= daysOfMonth[i];
        }

        return String.format("%02d.%02d.%04d", day, month, year);
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int year = Integer.parseInt(in.nextLine().trim());

        String result = dayOfProgrammer(year);

        System.out.println(result);

        in.close();
    }
}