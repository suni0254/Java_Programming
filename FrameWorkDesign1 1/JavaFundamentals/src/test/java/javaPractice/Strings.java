package javaPractice;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        //Strings are immutable

        String string = "Mohd";//object is created
        string.concat("Imran"); // still prints -  Mohd
        string = string.concat("Imran"); //another object is created print - MohdImran
        System.out.println(string);

//        Scanner sc = new Scanner(System.in);
//
//        String names[] = new String[3];
//
//        int totalLength = 0;
//
//        for(int i=0; i<names.length; i++) {
//            names[i] = sc.next();
//            totalLength = totalLength + names[i].length();
//        }
//        System.out.print(totalLength);
        //changeCharacters();
//        subString();
    }

//    public static void changeCharacters() {
//        Scanner sc = new Scanner(System.in);
//
//        String name = sc.nextLine();
////        String result = name.replace('e', 'i');
//        System.out.println(result);

//        String result ="";
//
//        for(int i=0; i<name.length(); i++) {
//            char c = name.charAt(i);
//            if("aeiouAEIOU".indexOf(c) != -1) {
//                result = result + '*';
//            }
//            else {
//                result = result + c;
//            }
//        }
//        System.out.println(result);
//    }
//
//    public static void subString() {
//        Scanner sc = new Scanner(System.in);
//
//        String email = sc.next();
//
//        String userName = "";
//
//        for(int i=0; i<email.length(); i++) {
//            if(email.charAt(i) == '@') {
//                break;
//            }
//            else {
//                userName = userName + email.charAt(i);
//            }
//        }
//        System.out.println(userName);
//    }
}
