// https://www.hackerrank.com/challenges/sherlock-and-squares/problem

import java.util.Scanner;

public class Solution {

    static int squares(int a, int b) {
        /*
        int result = 0;
        int root = 1;

        while (root * root <= b) {
            if (root * root >= a) {
                result++;
            }
            root++;
        }
        
        return result;
        */

        return (int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a))) + 1;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = in.nextLine().split(" ");

            int a = Integer.parseInt(ab[0]);

            int b = Integer.parseInt(ab[1]);

            int result = squares(a, b);

            System.out.println(String.valueOf(result));
        }

        in.close();

    }
}