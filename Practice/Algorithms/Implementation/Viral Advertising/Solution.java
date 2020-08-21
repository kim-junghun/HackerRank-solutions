// https://www.hackerrank.com/challenges/strange-advertising/problem

import java.util.Scanner;

public class Solution {

    static int viralAdvertising(int n) {
        int result = 0;
        int recipients = 5;

        for (int i = 0; i < n; i++) {
            int liked = recipients / 2;
            result += liked;
            recipients = liked * 3;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int result = viralAdvertising(n);

        System.out.println(String.valueOf(result));

        in.close();
    }    
}