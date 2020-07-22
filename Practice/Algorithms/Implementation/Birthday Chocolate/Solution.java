// https://www.hackerrank.com/challenges/the-birthday-bar/problem

import java.util.List;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.LinkedList;

public class Solution {

    static int birthday(List<Integer> s, int d, int m) {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        int result = 0;
        int sum;
        for (int i : s) {            
            queue.add(i);
            if (queue.size() > m) {
                queue.poll();
            }
            if (queue.size() == m) {
                sum = 0;
                for (int j : queue) {
                    sum += j;
                }
                if (sum == d) {
                    result ++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine().trim());

        List<Integer> s = Stream.of(in.nextLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        
        String[] dm = in.nextLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);
        
        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        System.out.println(String.valueOf(result));

        in.close();
    }
}