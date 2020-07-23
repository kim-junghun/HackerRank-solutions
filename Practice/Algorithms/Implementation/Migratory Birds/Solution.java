// https://www.hackerrank.com/challenges/migratory-birds/problem

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Solution {

    static int migratoryBirds(List<Integer> arr) {

        int[] sightings = {0, 0, 0, 0, 0, 0};

        for (int i : arr) {
            sightings[i]++;
        }

        int result = 0;
        int max = 0;

        for (int i = 0; i < sightings.length; i++) {
            if (sightings[i] > max) {
                max = sightings[i];
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int arrCount = Integer.parseInt(in.nextLine().trim());

        List<Integer> arr = Stream.of(in.nextLine().replaceAll("\\s+$", "").split(" "))
                                  .map(Integer::parseInt)
                                  .collect(Collectors.toList());
        
        int result = migratoryBirds(arr);

        System.out.println(String.valueOf(result));

        in.close();
    }
}