// https://www.hackerrank.com/challenges/permutation-equation/problem

import java.util.Scanner;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            result[p[p[i] - 1] - 1] = i + 1;
        }        

        return result;
    }

    public static void main(String[] args) { 

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = in.nextLine().split(" ");
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

        for (int i = 0; i < result.length; i++) {
            System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.println("");;
            }
        }

        System.out.println("");

        in.close();
    } 
}