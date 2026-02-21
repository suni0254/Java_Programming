package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstLastOccurence {
    static int firstIndex = -1;
    static int lastIndex = -1;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String random = sc.next();
        char c = sc.next().charAt(0);
        firstLastOccurence(random, c, 0);

        System.out.println("First character found at index: " + firstIndex);
        System.out.print("Last character found at index: " + lastIndex);


//        ArrayList<Integer> indexes = new ArrayList<>();
//        indexes = firstLastOccurence(c, random, indexes, 0);
//
//        if(!indexes.isEmpty()){
//            System.out.println("The first character is found at index: " + indexes.get(0));
//            System.out.println("The Last character is found at index: " + indexes.get(indexes.size()-1));
//        }
//        else {
//            System.out.println("Character not found");
//        }
//    }
//
//    public static ArrayList<Integer> firstLastOccurence(char c, String random, ArrayList<Integer> indexes, int i) {
//        if(i==random.length()) {
//            return indexes;
//        }
//        if(Character.toLowerCase(random.charAt(i)) == Character.toLowerCase(c)) {
//            indexes.add(i);
//        }
//        return firstLastOccurence(c, random, indexes, i+1);

    }
    public static int firstLastOccurence(String s, char c, int i) {
        if(i==s.length()) {
            return 0;
        }
        if(Character.toLowerCase(s.charAt(i))==c) {
            if(firstIndex == -1) {
                firstIndex = i;
            }
            else {
                lastIndex = i;
            }
        }
        return  firstLastOccurence(s, c, i+1);
    }
}
