// https://www.hackerrank.com/challenges/marcs-cakewalk/problem

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

    static long marcsCakewalk(int[] calorie) {
        long result = 0;

        List<Integer> calorieList = Arrays.stream(calorie)
                                          .boxed()
                                          .sorted(Collections.reverseOrder())
                                          .collect(Collectors.toList());

        for (int i = 0; i < calorieList.size(); i++) {
            result += Math.pow(2, i) * calorieList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] calorie = new int[n];

        String[] calorieItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int calorieItem = Integer.parseInt(calorieItems[i]);
            calorie[i] = calorieItem;
        }

        long result = marcsCakewalk(calorie);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
    
}
