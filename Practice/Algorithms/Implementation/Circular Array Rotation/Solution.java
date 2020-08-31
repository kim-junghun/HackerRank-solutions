// https://www.hackerrank.com/challenges/circular-array-rotation/problem

import java.util.Scanner;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {       
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int index = (queries[i] - k) % a.length;
            if (index < 0) {
                index += a.length;
            }
            result[i] = a[index];
        }

        return result;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String[] nkq = in.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = in.nextLine().split(" ");
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = in.nextInt();
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        int[] result = circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.length; i++) {            
            System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.println("");
            }
        }

        System.out.println("");

        in.close();
    }
}