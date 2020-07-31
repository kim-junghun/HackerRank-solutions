// https://www.hackerrank.com/challenges/cats-and-a-mouse/problem

import java.util.Scanner;

public class Solution {

    static String catAndMouse(int x, int y, int z) {
        int distanceA = Math.abs(z - x);
        int distanceB = Math.abs(z - y);

        if (distanceA < distanceB) {
            return "Cat A";
        } else if (distanceA > distanceB) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < q; i++) {
            String[] xyz = in.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);
            int y = Integer.parseInt(xyz[1]);
            int z = Integer.parseInt(xyz[2]);
            
            String result = catAndMouse(x, y, z);

            System.out.println(result);
        }

        in.close();
    }
}