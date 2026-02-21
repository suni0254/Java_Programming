package recursion;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String random = sc.next();

        HashSet<String> setOfStrings = new HashSet<>();
        uniqueSubsequence(random, 0,"", setOfStrings);

        for(String str: setOfStrings) {
            System.out.println(str);
        }
    }
    public static void uniqueSubsequence(String s, int i, String current, HashSet set) {
        if(i==s.length()) {
            set.add(current);
            return;
        }
        char currChar = s.charAt(i);

        uniqueSubsequence(s, i+1, current + currChar, set);

        uniqueSubsequence(s, i+1, current, set);
    }
}
