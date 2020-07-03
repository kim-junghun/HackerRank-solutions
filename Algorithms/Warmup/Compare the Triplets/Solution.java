// https://www.hackerrank.com/challenges/compare-the-triplets/problem

import java.util.ArrayList;
import java.util.stream.*;
import java.util.Scanner;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.joining;

public class Solution {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;
        
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alice++;
            } else if (a.get(i) < b.get(i)) {
                bob++;
            }
        }

        List<Integer> result = new ArrayList<Integer>();
        result.add(alice);
        result.add(bob);
        
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();
        String b = in.nextLine();
        
        List<Integer> aList = Stream.of(a.replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(toList());
        
        List<Integer> bList = Stream.of(b.replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(toList());

        List<Integer> result = compareTriplets(aList, bList);
        
        System.out.println(result.stream().map(Object::toString).collect(joining(" ")));

        in.close();
    }
}