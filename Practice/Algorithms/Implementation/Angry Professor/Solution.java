// https://www.hackerrank.com/challenges/angry-professor/problem

import java.util.Scanner;

public class Solution {

    static String angryProfessor(int k, int[] a) {
        int n = k;

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                n--;
                if (n <= 0) {
                    return "NO";
                }
            }
        }
        return "YES";        
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = in.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] a = new int[n];

            String[] aItems = in.nextLine().split(" ");
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }

            String result = angryProfessor(k, a);

            System.out.println(result);
        }

        in.close();
    }
}