// https://www.hackerrank.com/challenges/java-regex/problem

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

        in.close();
    }
}

class MyRegex {    
    // 000 - 199        [0-1]?[0-9]?[0-9]
    // 200 - 249        2[0-4][0-9]
    // 250 - 255        25[0-5]
    String pattern = "(([0-1]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-1]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$";
}