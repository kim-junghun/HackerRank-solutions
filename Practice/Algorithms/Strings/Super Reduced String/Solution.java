// https://www.hackerrank.com/challenges/reduced-string/problem

import java.util.Scanner;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.List;

public class Solution {

    static String superReducedString(String s) {

        List<Character> chars = s.chars().mapToObj(i -> (char) i).collect(Collectors.toList());
        
        while (true) {
            boolean found = false;
            for (int i = 1; i < chars.size(); i++) {
                if (chars.get(i) == chars.get(i - 1)) {
                    chars.remove(i - 1);
                    chars.remove(i - 1);
                    found = true;
                }
            }
            if (chars.size() == 0) { return "Empty String"; }
            if (!found) { break; }
        }

        return chars.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        String result = superReducedString(s);

        System.out.println(String.valueOf(result));

        in.close();
    }
    
}
