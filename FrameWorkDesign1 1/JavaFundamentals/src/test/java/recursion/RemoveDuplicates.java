package recursion;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String random = sc.next();

        System.out.println("String after removing duplicates: " + removeDuplicates(random, 0, ""));
    }
    public static String removeDuplicates(String s, int i, String finalString) {
        if(i==s.length()) {
            return finalString;
        }

        char currentChar = s.charAt(i);
        boolean found = false;

        for(int j=0; j<=finalString.length()-1; j++) {
            if (finalString.charAt(j) == currentChar) {
                found = true;
                break;
            }
        }

            if(!found) {
                finalString += s.charAt(i);
        }
        return removeDuplicates(s, i+1, finalString);
    }
}
