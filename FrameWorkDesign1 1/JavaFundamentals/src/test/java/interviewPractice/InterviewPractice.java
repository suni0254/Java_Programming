package interviewPractice;

import java.util.HashSet;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;


public class InterviewPractice {

    public static void main(String[] args) {

        //Reverse of String
//        String str = "String";
//
//        for(int i=str.length()-1; i>=0; i--) {
//
//            System.out.print(str.charAt(i));
//
//        }

        //2nd count how many times each character appears
//        String str = "Mohd Imranullah Khan";
//
//        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
//
//        for(char c : str.toCharArray()) {
//            if(Character.isLetter(c)) {
//                hm.put(c, hm.getOrDefault(c,0) + 1);
//            }
//        }
//
//        for(Map.Entry<Character, Integer> map : hm.entrySet()) {
//            System.out.println(map.getKey() + " : " + map.getValue());
//        }


        //First non repeated letter
//        String str = "Mohammed";
//        str = str.toLowerCase();
//
//        for(int i=0; i<str.length(); i++) {
//            boolean repeated = false;
//            for(int j=0; j<str.length(); j++) {
//                if(i!=j && str.charAt(i) == str.charAt(j)) {
//                    repeated = true;
//                    break;
//                }
//            }
//            if(!repeated) {
//                System.out.println("First non repeated character is : " + str.charAt(i));
//                return;
//            }
//        }


        //Is Anagram?
//        String str1 = "Listen";
//        String str2 = "Silent";
//
//        str1 = str1.toLowerCase();
//        str2 = str2.toLowerCase();
//
//        if(str1.length()!=str2.length()) {
//            System.out.println("Strings are not Anagrams");
//        }
//
//        char[] charArr1 = str1.toCharArray();
//        char[] charArr2 = str2.toCharArray();
//
//        Arrays.sort(charArr1);
//        Arrays.sort(charArr2);
//
//        boolean isAnagram = false;
//
//        if(Arrays.equals(charArr1, charArr2)) {
//            isAnagram = true;
//        }
//
//        System.out.println(isAnagram? "Strings are Anagram" : "Strings are not Anagrams");


        //2nd largest number in Array
//        int arr[] = {3, 7, 2, 9, 5};
//
//        int largest = arr[0];
//        int secondLargest = arr[1];
//
//        for(int i=0; i<arr.length; i++) {
//            for(int j=0; j<arr.length-1; j++) {
//                int temp = 0;
//                if(arr[j] > arr[j+1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        for(int i : arr) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println("The second largest number is : " + arr[arr.length-2]);


        //First element repeating in an array
//        int arr1[] = {2, 7, 8, 4, 9, 5, 3, 7, 8};
//
//        for(int i=0; i< arr1.length; i++) {
//            for(int j=i+1; j< arr1.length; j++) {
//                if(arr1[i] == arr1[j]) {
//                    System.out.println("First repeated element is : " + arr1[i]);
//                    return;
//                }
//            }
//        }


        //Palindrome
//        String str = "Race car";
//
//        str = str.replaceAll(" ", "").toLowerCase();
//
//        StringBuilder sb = new StringBuilder();
//
//        for(int i=str.length()-1; i>=0; i--) {
//            sb.append(str.charAt(i));
//        }
//
//        if(str.contentEquals(sb)) {
//            System.out.println("String is Palindrome");
//        }
//        else System.out.println("Not a Palindrome");


        //Missing element in an array
//        int arr1[] = {2, 3, 4, 5, 7, 9};
//
//        for(int i=0; i<arr1.length-1; i++) {
//            if((arr1[i]+1) != arr1[i+1]) {
//                System.out.println("The missing element is : " + (arr1[i]+1));
//                break;
//            }
//        }


        //Missing element in an array for Sorted array
//        int arr1[] = {2, 7, 8, 4, 9, 5, 3};
//
//        int sum = 0;
//        int max = 0;
//
//        for(int num : arr1) {
//            sum +=num;
//            if(num > max) {
//                max = num;
//            }
//        }
//
//        int expectedSum = max * (max+1)/2;
//
//        if(expectedSum == sum) {
//            System.out.println("No number is missing");
//        }
//        else System.out.println("The missing number is : " + (expectedSum-sum));


        //Missing element in an array for Unsorted array
//        int arr1[] = {2, 7, 8, 4, 9, 5, 3};
//
//        int sum = 0;
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for(int num :arr1) {
//            sum +=num;
//
//            if(num < min) {
//                min = num;
//            }
//
//            if(num > max) {
//                max = num;
//            }
//        }
//
//        int expectedSum = (max * (max+1))/2 - (min * (min-1))/2;
//
//        if(expectedSum == sum) {
//            System.out.println("No missing number");
//        }
//        else System.out.println("the missing number is : " + (expectedSum-sum));


        //No. of vowels and consonants
//        String str = "Mohammed Imranullah khan";
//        str = str.replaceAll(" ", "");
//
//        int noOfVowels = 0;
//        int noOfConsonants = 0;
//
//        for(int i=0; i<str.length(); i++) {
//            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
//                noOfVowels++;
//            }
//            else noOfConsonants++;
//        }
//        System.out.println("No of vowels : " + noOfVowels + "\nNo of Consonants : " + noOfConsonants);


        //No of words in a sentence
//        String str = "Mohammed Imran ullah khan";
//
//        str = str.trim();
//
//        int noOfWords = 0;
//
//        if(str.isEmpty()) {
//            System.out.println("String is empty");
//            return;
//        }
//        else {
//            noOfWords++;
//        }
//        for(int i=0; i<str.length(); i++) {
//            if(str.charAt(i) == ' ') {
//                noOfWords++;
//            }
//        }
//        System.out.println(noOfWords);


        //Prime Number
//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//
//        boolean isPrime = true;
//
//        for(int i=2; i * i <=num; i++) {
//            if(num % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }

//        System.out.println(isPrime? "Number is Prime" : "Number is not Prime");


        //Sum of All digits
//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//
//        int sum = 0;
//
//        for(int i=0; i<=num; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);


        //Reverse of a number
//        Scanner sc = new Scanner(System.in);
//
//        int number = sc.nextInt();
//
//        int div = 0;
//        int reverse = 0;
//
//        while(number != 0) {
//            div = number % 10;
//            number= number/10;
//            reverse = reverse * 10 + div;
//        }
//
//        System.out.println("Reverse of the number is : " + reverse);


        //Factorial of a number
//        Scanner sc = new Scanner(System.in);
//
//        int number = sc.nextInt();
//        int fact = 1;
//        while(number!=0) {
//            fact = fact * number;
//            number--;
//        }
//
//        System.out.println(fact);


        //Armstrong number
//        Scanner sc = new Scanner(System.in);
//
//        int ArmstrongCheck = sc.nextInt();
//        int number = ArmstrongCheck;
//        int result = 0;
//        int digits = String.valueOf(number).length();
//        int div = 0;
//
//        boolean Armstrong = false;
//        while(number!=0) {
//            div = number % 10;
//            result = result + (int)Math.pow(div, digits);
//            number = number/10;
//        }
//
//        if(result == ArmstrongCheck) {
//            Armstrong = true;
//        }
//
//        System.out.println(Armstrong? "Number is Armstrong" : "Number is not Armstrong");


        //Perfect number
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int sum = 0;
//
//        for(int i=1; i<=number/2; i++) {
//            if(number % i == 0) {
//                sum = sum + i;
//            }
//        }
//
//        if(sum == number) {
//            System.out.println("Number is perfect");
//        }
//        else System.out.println("Number is not perfect");


        //Strong number
//        Scanner sc = new Scanner(System.in);
//        int isStrongNumber = sc.nextInt();
//        int number = isStrongNumber;
//        int result = 0;
//        int fact = 0;
//
//        while(number!=0) {
//            int sum = 1;
//            result = number % 10;
//            while (result !=0) {
//                sum = sum * result;
//                result--;
//            }
//            fact = fact + sum;
//            number = number/10;
//        }
//
//        if(fact == isStrongNumber) {
//            System.out.println("Given number is a Strong number");
//        }
//        else System.out.println("Not a Strong number");


        //Perfect Square
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//
//        boolean isPerfectSquare = false;
//        for(int i=0; i*i<=number; i++) {
//            if(i*i == number) {
//                isPerfectSquare = true;
//                break;
//            }
//        }
//
//        System.out.println(isPerfectSquare? "Number is perfect Square" : "Not a perfect Square");


        //Perfect Cube
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//
//        boolean isPerfectCube = false;
//        for(int i=0; i*i*i<=number; i++) {
//            if(i*i*i == number) {
//                isPerfectCube = true;
//                break;
//            }
//        }
//
//        System.out.println(isPerfectCube? "Number is perfect Cube" : "Not a perfect Cube");


        //Palindrome for Numbers
//        Scanner sc = new Scanner(System.in);
//        int palindrome = sc.nextInt();
//        int number = palindrome;
//        int result = 0;
//        int sum = 0;
//
//        while(number!=0) {
//            result = number % 10;
//            sum = sum * 10 + result;
//            number = number/10;
//        }
//
//        if(sum == palindrome) {
//            System.out.println("Number is Palindrome");
//        }
//        else System.out.println("Number is not palindrome");
//    }



        //Fibonacci series
//        Scanner sc = new Scanner(System.in);
//        int limit = sc.nextInt();
//        int firstNum = 0;
//        int nextNum = 1;
//        int sum = 0;
//
//        while (limit !=0) {
//            sum = sum + firstNum;
//            System.out.println(sum);
//            firstNum = nextNum;
//            nextNum = sum;
//            limit--;
//        }



        //Repeated digits in a number
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//
//        boolean[] seen = new boolean[10];
//
//        int repeatedDigit = -1;
//        while(number>0) {
//            int digit = number % 10;
//            if(seen[digit]) {
//                repeatedDigit = digit;
//                break;
//            }
//            seen[digit] = true;
//            number = number / 10;
//        }
//
//        if(repeatedDigit != -1) {
//            System.out.println("The first repeated digit is : " + repeatedDigit);
//        }
//        else System.out.println("No repeated digit found");




        //Generate random strong in "abcABC1234" format
//        String rand = RandomStringUtils.random(3, "abc") + RandomStringUtils.random(3, "ABC") + RandomStringUtils.random(4, "1234");
//        System.out.println(rand);



        //Bubble sort
//        int arr1[] = {2, 7, 8, 4, 9, 5, 3};
//
//        int temp = 0;
//        for(int i=0; i< arr1.length; i++) {
//            for(int j=1; j< arr1.length-i; j++) {
//                if(arr1[j-1] > arr1[j]) {
//                    temp = arr1[j];
//                    arr1[j] = arr1[j-1];
//                    arr1[j-1] = temp;
//                }
//            }
//        }
//
//        for(int i : arr1) {
//            System.out.print(i + " ");
//        }




        //Selection sort
//        int arr1[] = {2, 7, 8, 4, 9, 5, 3};
//
//        for(int i=0; i< arr1.length; i++) {
//            int smallest = i;
//            for(int j=i+1; j< args.length; j++) {
//                if(arr1[i]>arr1[j]) {
//                    smallest = arr1[j];
//                }
//            }
//            int temp = arr1[smallest];
//            arr1[smallest] = arr1[i];
//            arr1[i] = temp;
//        }
//
//        for(int i : arr1) {
//            System.out.println(i);
//        }



        //Insertion sort
//        int arr1[] = {2, 7, 8, 4, 9, 5, 3};
//
//        for(int i=1; i< arr1.length; i++) {
//            int current = arr1[i];
//
//            int j= i-1;
//
//            while(j>=0 && current<arr1[j]) {
//                arr1[j+1] = arr1[j];
//                j--;
//            }
//            arr1[j+1] = current;
//        }
//
//        for(int i : arr1) {
//            System.out.println(i);
//        }




        //Remove duplicates in an array
//        int arr1[] = {2, 7, 8, 4, 9, 4, 7, 5, 3};
//
//        HashSet<Integer> hs = new HashSet<>();
//        for(int i : arr1) {
//            hs.add(i);
//        }
//
//        for(int i : hs) {
//            System.out.println(i);
//        }




        //Repeated char using ASCII
//        String str = "Mohammed";
//        str = str.toLowerCase();
//
//        int[] ascii = new int[256];
//
//        for(int i=0; i<str.length(); i++) {
//            ascii[str.charAt(i)]++;
//        }
//
//        for(int i=0; i<256; i++) {
//            if(ascii[i] > 1) {
//                System.out.println((char)i + " repeated : " + ascii[i] + " times");
//            }
//        }


        //Captalize all the first letters
//        String str = "mohd imran ullah khan";
//
//
//        StringBuilder sb = new StringBuilder();
//        String[] words = str.split(" ");
//
//
//        for(String word : words) {
//            sb.append(word.toUpperCase().charAt(0));
//            sb.append(word.substring(1));
//            sb.append(" ");
//        }
//
//        for(int i=words.length-1; i>=0; i--) {
//            System.out.print(words[i] + " ");
//        }
//        System.out.println("\n" + sb);



        //Singleton class
//        class Singleton {
//            private static final Singleton instance = new Singleton(); // instance created at class load
//
//            private Singleton() {} // private constructor
//
//            public static Singleton getInstance() {
//                return instance; // returns the single instance
//            }
//
//            public void showMessage() {
//                System.out.println("Singleton instance method called");
//            }
//        }
//
//        public class Main {
//            public static void main(String[] args) {
//                Singleton obj = Singleton.getInstance();
//                obj.showMessage();
//            }
//        }




        //Swap without using temp variable
//        int a = 5;
//        int b = 10;
//
//        System.out.println("Before swap: a = " + a + ", b = " + b);
//
//        a = a + b; // 5 + 10 = 15
//        b = a - b; // 15 - 10 = 5
//        a = a - b; // 15 - 5 = 10
//
//        System.out.println("After swap: a = " + a + ", b = " + b);


    }
}

