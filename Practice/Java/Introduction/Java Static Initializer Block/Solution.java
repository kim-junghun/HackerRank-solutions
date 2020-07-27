// https://www.hackerrank.com/challenges/java-static-initializer-block/problem

import java.util.Scanner;

public class Solution {

    private static int B;
    private static int H;
    private static boolean flag = false;

    static {
        Scanner in = new Scanner(System.in);

        B = Integer.parseInt(in.nextLine().trim());

        H = Integer.parseInt(in.nextLine().trim());

        in.close();

        if (B <= 0 || H <= 0) {
            try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
                System.out.println(String.format("%s: %s", e.getClass().getName(), e.getMessage()));                
            }
        } else {
            flag = true;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}