// https://www.hackerrank.com/challenges/bon-appetit/problem

import java.util.List;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Solution {

    static void bonAppetit(List<Integer> bill, int k, int b) {        

        int actual = bill.stream().reduce((x, y) -> {
            return x + y;
        }).orElse(-1) - bill.get(k);        
        actual /= 2;

        if (b == actual) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(String.valueOf(b - actual));
        }
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String[] nk = in.nextLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        List<Integer> bill = Stream.of(in.nextLine().replaceAll("\\s+$", "").split(" "))
                                   .map(Integer::parseInt)
                                   .collect(Collectors.toList());

        int b = Integer.parseInt(in.nextLine().trim());

        bonAppetit(bill, k, b);

        in.close();
    }
}