// https://www.hackerrank.com/challenges/grading/problem

import java.util.List;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Solution {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream().map(it -> {
            if ((it >= 38) && ((it % 5) > 2)) {
                return it + (5 - (it % 5));
            } else {
                return it;
            }
        }).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int gradesCount = Integer.parseInt(in.nextLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            return in.nextLine().replaceAll("\\s+$", "");
        }).map(String::trim)
          .map(Integer::parseInt)
          .collect(Collectors.toList());

        List<Integer> result = gradingStudents(grades);

        for (int i : result) {
            System.out.println(String.valueOf(i));
        }

        in.close();
    }
}