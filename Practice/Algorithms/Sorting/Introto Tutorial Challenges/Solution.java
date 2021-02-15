// https://www.hackerrank.com/challenges/tutorial-intro/problem

import java.util.Scanner;
import java.util.stream.*;

public class Solution {

    static int introTutorial(int V, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == V) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int n = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = in.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = introTutorial(V, arr);        

        System.out.println(String.valueOf(result));

        in.close();
    }
    
}
