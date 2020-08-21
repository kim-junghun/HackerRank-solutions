// https://www.hackerrank.com/challenges/save-the-prisoner/problem

import java.util.Scanner;

public class Solution {

    static int saveThePrisoner(int n, int m, int s) {
        if (n == 1) {
            return 1;
        }

        int result = (m + s) % n - 1;

        if (result <= 0) {
            result += n;
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nms = in.nextLine().split(" ");

            int n = Integer.parseInt(nms[0]);

            int m = Integer.parseInt(nms[1]);

            int s = Integer.parseInt(nms[2]);

            int result = saveThePrisoner(n, m, s);

            System.out.println(String.valueOf(result));
        }

        in.close();
    }    
}