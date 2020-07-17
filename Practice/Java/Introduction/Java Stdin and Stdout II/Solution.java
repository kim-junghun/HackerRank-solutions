// https://www.hackerrank.com/challenges/java-stdin-stdout/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        double d = in.nextDouble();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = in.nextLine();        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        in.close();    
    }
}