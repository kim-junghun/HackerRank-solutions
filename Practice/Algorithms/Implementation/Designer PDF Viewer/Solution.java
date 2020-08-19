// https://www.hackerrank.com/challenges/designer-pdf-viewer/problem

import java.util.Scanner;

public class Solution {

    static int designerPdfViewer(int[] h, String word) {
        int maxHeight = 0;
        for (int i = 0; i < word.length(); i++) {            
            int height = h[word.charAt(i) - 'a'];
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight * word.length();
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int[] h = new int[26];

        String[] hItems = in.nextLine().split(" ");
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = in.nextLine();

        int result = designerPdfViewer(h, word);

        System.out.println(String.valueOf(result));        

        in.close();
    }
}