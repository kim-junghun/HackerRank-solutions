// https://www.hackerrank.com/challenges/tag-content-extractor/problem

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {    

    public static void main(String[] args) {

        String regularExpression = "<(.+)>([^<]+)</\\1>";
        Pattern p = Pattern.compile(regularExpression);
        
        Scanner in = new Scanner(System.in);

        int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
            // Write your code here
            boolean found = false;
            Matcher m = p.matcher(line);
            while (m.find()) {
                System.out.println(m.group(2));
                found = true;
            }
            if (!found) {
                System.out.println("None");
            }
			
			testCases--;
		}

        in.close();
    }    
}