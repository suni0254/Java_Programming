package recursion;

import java.util.Scanner;

public class MoveCharactersToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String random = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(moveCharToEnd(random, c, 0, "", ""));

    }
    public static String  moveCharToEnd(String s, char c, int i, String nonTarget, String target) {
        if(i==s.length()) {
            return nonTarget + target;
        }
        if(Character.toLowerCase(s.charAt(i)) == c) {
            target = target + s.charAt(i);
        }
        else {
            nonTarget = nonTarget + s.charAt(i);
        }

        return moveCharToEnd(s, c, i+1, nonTarget, target);
    }
}
