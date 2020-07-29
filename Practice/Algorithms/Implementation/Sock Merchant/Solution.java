// https://www.hackerrank.com/challenges/sock-merchant/problem

import java.util.stream.*;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        HashMap<Integer, Integer> sockMap = new HashMap<Integer, Integer>();

        for (int i : ar) {
            if (sockMap.containsKey(i)) {
                sockMap.put(i, sockMap.get(i) + 1);
            } else {
                sockMap.put(i, 1);
            }
        }

        for (int i : sockMap.keySet()) {
            result += (sockMap.get(i) / 2);
        }
        return result;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = Stream.of(in.nextLine().replaceAll("\\s+$", "").split(" "))
                         .mapToInt(Integer::parseInt)
                         .toArray();
        
        int result = sockMerchant(n, ar);

        System.out.println(String.valueOf(result));
        
        in.close();
    }
}