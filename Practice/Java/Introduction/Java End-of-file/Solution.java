// https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AtomicInteger n = new AtomicInteger();

        while (in.hasNext()) {
            String line = in.nextLine();
            System.out.println(String.format("%d %s", n.incrementAndGet(), line));
        }

        in.close();
    } 
}