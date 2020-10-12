import java.util.Scanner;

public class Solution {

    static int lonelyinteger(int[] a) {
        int result = 0;
        
        for (int i : a) {
            result = result ^ i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = in.nextLine().split(" ");
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = lonelyinteger(a);

        System.out.println(String.valueOf(result));        

        in.close();    
    }    
}
