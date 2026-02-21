package recursion;


import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        towerOfHanoi(n, "S", "H", "D");

    }
    public static void towerOfHanoi(int n, String source, String helper, String destination) {

        if(n==1){
            System.out.println("Disk " + n + " is transferred from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(n-1, source, destination, helper);
        System.out.println("Disk " + n + " is transferred from " + source + " to " + destination);
        towerOfHanoi(n-1, helper, source, destination);
    }
}
