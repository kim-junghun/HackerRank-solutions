// https://www.hackerrank.com/challenges/the-power-sum/problem

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    static int powerSum(int X, int N) {

        List<Integer> powers = new ArrayList<Integer>();
        for (int i = 1; ; i++) {
            int pow = (int) Math.pow(i, N);
            if (pow <= X) {
                powers.add(pow);
            } else {
                break;
            }
        }

        int[] ways = new int[X + 1];
        ways[0] = 1;
        
        for (int i = 0; i < powers.size(); i++) {
            for (int j = X; j >= powers.get(i); j--) {
                ways[j] = ways[j] + ways[j - powers.get(i)];
            }
        }
        
        return ways[X];
    }
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int X = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int N = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = powerSum(X, N);

        System.out.println(String.valueOf(result));

        in.close();
        
    }
}
