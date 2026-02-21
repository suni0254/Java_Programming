package recursion;

import java.util.Scanner;

public class Subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String random = sc.next();

        subsequences(random, 0, "");
    }

    public static void subsequences(String s, int i, String newString) {
        if(i == s.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = s.charAt(i);

        subsequences(s, i+1, newString+currChar);

        subsequences(s, i+1, newString);
    }
}
