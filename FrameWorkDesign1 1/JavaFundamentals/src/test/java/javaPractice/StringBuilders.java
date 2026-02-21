package javaPractice;

import java.util.Scanner;

public class StringBuilders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("Emran");

        sb.setCharAt(0,'I');
        sb.append("ullah");
        sb.append(" Khan");
        sb.replace(0,0, "Mohd ");
        sb.insert(10, " ");
        sb.delete(10, 11);

        System.out.println(sb);

        for(int i=0; i<sb.length()/2; i++) {
            int j = sb.length()-i-1;

            char firstChar = sb.charAt(i);
            char lastChar = sb.charAt(j);
            sb.setCharAt(i, lastChar);
            sb.setCharAt(j, firstChar);
        }
        System.out.println(sb);
    }
}
