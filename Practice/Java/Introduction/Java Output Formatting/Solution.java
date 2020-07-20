// https://www.hackerrank.com/challenges/java-output-formatting/problem

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            // String s1=sc.next();
            // int x=sc.nextInt();
            //Complete this line
            String s1 = in.next();
            int x = in.nextInt();
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            System.out.println(String.format("%-15s%03d", s1, x));
        }
        System.out.println("================================");


        in.close();
    }
}