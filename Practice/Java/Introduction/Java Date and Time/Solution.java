// https://www.hackerrank.com/challenges/java-date-and-time/problem

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DATE, day);        

        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();        
    }
}

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] firstMultipleInput = in.nextLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String result = Result.findDay(month, day, year);

        System.out.println(result);

        in.close();
    }
}