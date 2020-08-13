// https://www.hackerrank.com/challenges/picking-numbers/problem

import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.List;
import java.util.HashSet;
import java.util.Scanner;


public class Solution {

    static int pickingNumbers(List<Integer> a) {
        int result = 0;
                
        HashSet<Integer> set = new HashSet<Integer>();        
        for (int i = 0; i < a.size(); i++) {
            set.add(a.get(i));
        }

        for (int i : set) {
            int temp = 0;
            for (int j : a) {
                if ((i - j <= 1) && (i >= j)) {
                    temp++;
                }
            }
            if (temp > result) {
                result = temp;
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine().trim());

        List<Integer> a = Stream.of(in.nextLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        
        int result = pickingNumbers(a);

        System.out.println(String.valueOf(result));
                                
        in.close();
    }
}