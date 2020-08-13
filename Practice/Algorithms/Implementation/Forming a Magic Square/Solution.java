// https://www.hackerrank.com/challenges/magic-square-forming/problem

import java.util.Scanner;

public class Solution {

    static int[][] rotate(int[][] arr) {
        int[][] result = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i].clone();
        }

        return reverseCol(transpose(result));        
    }

    static int[][] reverseRow(int[][] arr) {        
        int[][] result = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i].clone();
        }
        for (int i = 0; i < result.length / 2; i++)    {
            int[] temp = result[i];
            result[i] = result[result.length - i - 1];
            result[result.length - i - 1] = temp;
        }
        return result;
    }

    static int[][] reverseCol(int[][] arr) {
        int[][] result = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i].clone();
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length / 2; j++) {
                int temp = result[i][j];
                result[i][j] = result[i][result[i].length - j - 1];
                result[i][result[i].length - j - 1] = temp;
            }
        }
        return result;
    }

    static int[][] transpose(int[][] arr) {
        int[][] result = new int[arr.length][arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                result[j][i] = arr[i][j];                                
            }
        }
        return result;
    }

    static int[][] createMagicSquare(int n) {
        int[][] result = new int[n][n];

        int row = 0;
        int col = n / 2;

        int val = 1;
        while (val <= Math.pow(n, 2)) {
            result[row][col] = val;
            val++;
            int nextRow = (row + n - 1) % n;
            int nextCol = (col + 1) % n;
            if (result[nextRow][nextCol] != 0) {
                row++;
            } else {
                row = nextRow;
                col = nextCol;
            }
        }
        
        return result;
    }

    static int formingMagicSquare(int[][] s) {
        int result = Integer.MAX_VALUE;

        int[][][] magicSquares = new int[8][][];

        int n = 3;

        magicSquares[0] = createMagicSquare(n);
        magicSquares[1] = reverseCol(magicSquares[0]);        
        magicSquares[2] = rotate(reverseCol(magicSquares[0]));
        magicSquares[3] = rotate(magicSquares[0]);
        magicSquares[4] = rotate(rotate(magicSquares[0]));
        magicSquares[5] = reverseRow(magicSquares[0]);        
        magicSquares[6] = rotate(reverseRow(magicSquares[0]));        
        magicSquares[7] = rotate(rotate(rotate(magicSquares[0])));

        for (int i = 0; i < magicSquares.length; i++) {
            int cost = 0;
            for(int j = 0; j < s.length; j++) {
                for (int k = 0; k < s.length; k++) {
                    cost += Math.abs(magicSquares[i][k][j] - s[j][k]);
                }
            }
            if (cost < result) {
                result = cost;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = in.nextLine().split(" ");
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        System.out.println(String.valueOf(result));

        in.close();
    }
}