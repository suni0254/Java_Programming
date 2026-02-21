package recursion;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Reverse", "Reverse".length()-1));
    }

    public static String reverseString(String s, int i) {
        if(i<0) {
            return "";
        }
        return s.charAt(i) + reverseString(s,--i);
    }
}
