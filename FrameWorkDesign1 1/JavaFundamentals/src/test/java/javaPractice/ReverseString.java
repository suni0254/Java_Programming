package javaPractice;

public class ReverseString {
    public static void main(String[] args) {

        String reverse = "Reverse";

        StringBuilder reverse2 = new StringBuilder("Reverse");

        for(int i=reverse.length()-1; i>=0; i--) {
            System.out.print(reverse.charAt(i));

        }
        System.out.print("\n" + reverse2.reverse());
    }
}
