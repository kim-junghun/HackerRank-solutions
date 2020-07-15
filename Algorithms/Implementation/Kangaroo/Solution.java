// https://www.hackerrank.com/challenges/kangaroo/problem

import java.util.Scanner;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {

        boolean isMeet = false;
        
        while (x1 < x2) {
            x1 += v1;
            x2 += v2;
            if (x1 == x2) {
                isMeet = true;
            }
        }

        return isMeet ? "YES" : "NO";
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] x1V1X2V2 = in.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        System.out.println(result);

        in.close();
    }
}