// https://www.hackerrank.com/challenges/big-sorting/problem

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class BigNumberComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /*
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() == o2.length()) {
            for (int i = 0; i < o1.length(); i++) {
                if (o1.charAt(i) > o2.charAt(i)) {
                    return 1;
                } else if (o1.charAt(i) < o2.charAt(i)) {
                    return -1;
                }
            }
            return 0;
        }
        return -1;
        */
        if (o1.length() != o2.length()) {
            return o1.length() - o2.length();
        }

        for (int i = 0; i < o1.length(); i++)
		{
			if (o1.charAt(i) != o2.charAt(i))
				return o1.charAt(i) - o2.charAt(i);
		}

		return 0;
    }
}

public class Solution {

    static String[] bigSorting(String[] unsorted) {
        Arrays.sort(unsorted, new BigNumberComparator());

        return unsorted;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] unsorted = new String[n];

        for (int i = 0; i < n; i++) {
            String unsortedItem = in.nextLine();
            unsorted[i] = unsortedItem;
        }

        String[] result = bigSorting(unsorted);

        for (int i = 0; i < result.length; i++) {
            System.out.println(String.valueOf(result[i]));
        }

        in.close();
    }
}
