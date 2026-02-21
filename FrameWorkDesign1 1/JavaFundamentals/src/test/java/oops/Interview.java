package oops;

import java.util.*;

public class Interview {

    //1st
//    public static void main(String[] args) {
//        WildAnimals wa = new Dog();
//        wa.sound();
//        wa.fetch();
//    }
//}
//class WildAnimals {
//    void sound() {
//        System.out.println("Makes sound");
//    }
//}
//
//class Dog extends WildAnimals {
//    void sound() {
//        System.out.println("Dog barks");
//    }
//    void fetch() {
//        System.out.println("Dog fetches");
//    }

    //2nd
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//
//        for (int i : list) {
//            list.remove(Integer.valueOf(i)); //cannot (add or remove) on collections in enhanced for loop
//        }
//
//        System.out.println(list);
//
//    }


//    3rd Reverse of a String
//    public static void main(String[] args) {
//        String s = "Hello";
//        for(int i=s.length()-1; i>=0; i--) {
//            System.out.print(s.charAt(i));
//        }
//    }

    //4th count how many times each character appears
//    public static void main(String[] args) {
//        String s = "MohammedImranullahKhan";
//        s= s.toLowerCase();
//
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for(char c : s.toCharArray()) {
//            if(Character.isLetter(c)) {           //to ignore numbers if any
//                map.put(c, map.getOrDefault(c, 0) + 1);
//            }
//        }
//
//        for(Map.Entry<Character, Integer> c : map.entrySet()) {
//            System.out.println(c.getKey() + " : " + c.getValue());
//        }
//    }

    //5th First non repeated letter
//    public static void main(String args[]) {
//        String s = "Mohammed";
//        s= s.toLowerCase();
//
//        for(int i=0; i<s.length(); i++) {
//            boolean repeated = false;
//            for(int j=0; j<s.length(); j++) {
//                if(i!=j && s.charAt(i) == (s.charAt(j))) {
//                    repeated = true;
//                    break;
//                }
//            }
//            if(!repeated){
//                System.out.println("First non-repeated character is : " + s.charAt(i));
//                break;
//            }
//        }
//    }


    //6th Is Anagrams
//    public static void main(String[] args) {
//        String s1 = "Listen";
//        String s2 = "Silent";
//
//        s1 = s1.toLowerCase();
//        s2 = s2.toLowerCase();
//
//        char[] c1 = s1.toCharArray();
//        char[] c2 = s2.toCharArray();
//
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//
//        if(Arrays.equals(c1,c2)) {
//            System.out.println("Strings are anagrams");
//        }
//        else
//            System.out.println("Strings are not anagrams");
//    }

    //6th 2nd way "is Anagrams"?
//    public static void main(String[] args) {
//        String s1 = "Listen";
//        String s2 = "Silent";
//
//        s1 = s1.toLowerCase();
//        s2 = s2.toLowerCase();
//
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        if(s1.length() != s2.length()) {
//            System.out.println("Strings are not anagrams");
//            return;
//        }
//
//        for(char c : s1.toCharArray()) {
//            map.put(c, map.getOrDefault(c,0) + 1);
//        }
//
//        for(char c: s2.toCharArray()) {
//            map.put(c, map.getOrDefault(c,0) - 1);
//        }
//
//        boolean isAnagram = true;
//        for(int count: map.values()) {
//            if(count !=0) {
//                isAnagram = false;
//                break;
//            }
//        }
//        System.out.println(isAnagram? "Strings are anagram" : "Strings are not anagrams");
//    }

    //7th 2nd largest number in an array
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int size = sc.nextInt();
//
//        int[] arr = new int[size];
//
//        for(int i=0; i<size; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int temp = 0;
//        for(int i=0; i<arr.length-1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//
//        if(arr[size] <2) {
//            System.out.println("No second largest number");
//        }
//        else {
//            System.out.println("Second largest number is : " + arr[size - 2]);
//            System.out.println("Largest number is : " + arr[size - 1]);
//        }
//    }

    //7th 2nd largest number in an array different approach
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//
//        for(int i=0; i<size; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//
//        if(arr.length < 2) {
//            System.out.println("Not enough elements");
//            return;
//        }
//
//        for(int num: arr) {
//            if(num > largest) {
//                secondLargest = largest;
//                largest = num;
//            }
//            else if(num > secondLargest && num!=largest) {
//                secondLargest = num;
//            }
//        }
//
//        System.out.println("Second largest number : " + secondLargest);
//        System.out.println("Largest number : " + largest);
//    }

    //8th first repeating element in array
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//
//        for(int i=0; i<arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        if(arr.length<2) {
//            System.out.println("No elements to compare");
//        }
//        for(int i=0; i<arr.length; i++) {
//            for(int j=i+1; j< arr.length; j++) {
//                if(arr[i] == arr[j]) {
//                    System.out.println("The first repeated element of array is : " + arr[j]);
//                    return;
//                }
//            }
//        }
//        System.out.println("There are no repeating elements");
//    }

    //8th first repeating element in array another approach
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//
//        for(int i=0; i<arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        if(arr.length<2) {
//            System.out.println("No elements to compare");
//        }
//
//        HashSet<Integer> num = new HashSet<>();
//
//        for(int number : arr) {
//            if(!num.add(number)) {
//                System.out.println("The first duplicate is : " + number);
//                return;
//            }
//        }
//        System.out.println("No duplicates found");
//    }


    //9th is a Palindrome?
//    public static void main(String[] args) {
//        String s = "Race car";
//
//        s = s.replaceAll(" ", "");
//
//        StringBuilder sb = new StringBuilder();
//
//        for(int i=s.length()-1; i>=0; i--) {
//            sb.append(s.charAt(i));
//        }
//        if(s.replaceAll("\\s","").equalsIgnoreCase(sb.toString())) {
//            System.out.println("String is palindrome");
//        }
//        else
//            System.out.println("Not a palindrome");
//    }

    //10th missing element in array for sorted
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }

//        if (arr.length < 2) {
//            System.out.println("Not enough elements");
//            return;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (!((arr[i] + 1) == arr[i + 1])) {
//                System.out.println("The missing number is : " + (arr[i] + 1));
//                return;
//            }
//        }
//        System.out.println("No missing number");
//    }

    //10th missing element in array for unsorted
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        if (arr.length < 2) {
//            System.out.println("Not enough elements to compare");
//            return;
//        }
//
//        int max = 0;
//        int sum = 0;
//
//        for(int num : arr) {
//            sum += num;
//            if(num > max)
//                max = num;
//        }
//
//        int expectedSum = max * (max+1)/2;
//
//        if(expectedSum == sum) {
//            System.out.println("No number is missing");
//        }
//        else {
//            System.out.println("The missing number is : " + (expectedSum - sum));
//        }
//    }

    //11th number of vowels or consonants
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//
//        s = s.replaceAll("\\s", "").toLowerCase();
//
//        int numOfVowel = 0;
//        int numOfConsonants = 0;
//
//        if(s.isEmpty()) {
//            System.out.println("String is empty");
//            return;
//        }
//
//        for(int i=0; i<s.length(); i++) {
//
//            char ch = s.charAt(i);
//
//            if(Character.isLetter(ch)) {
//                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
//                    numOfVowel++;
//                } else {
//                    numOfConsonants++;
//                }
//            }
//        }
//
//        System.out.println("Number of vowels : " + numOfVowel);
//        System.out.println("Number of consonants : " + numOfConsonants);
//    }

    //12th Number of Words in a sentence
//    public static void main(String[] args) {
//        String s = "Mohd Imran ullah khan";
//
//        s=s.trim();
//
//        int words = 0;
//
//        boolean inWord = false;
//
//        for(int i=0; i<s.length(); i++) {
//            char ch = s.charAt(i);
//
//            if(ch != ' ' && !inWord) {
//                inWord = true;
//                words++;
//            }
//            else if(ch == ' ') {
//                inWord = false;
//            }
//        }
//
//        System.out.println("Number of words : " + words);
//    }

    //13th Number is prime
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int number = sc.nextInt();
//
//        if(number <= 1) {
//            System.out.println("Number is not a prime");
//            return;
//        }
//
//        boolean isPrime = true;
//        for(int i=2; i * i <=number; i++) {
//            if(number % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//
//        if(isPrime) {
//            System.out.println("Number is prime");
//        }
//        else {
//            System.out.println("Number is not a prime");
//        }
//    }

    //14th sum of all digits of a number
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int number = sc.nextInt();
//        int sum =0;
//        int i=0;
//
//        if(number <= 1) {
//            System.out.println(number);
//            return;
//        }
//
//        while(i<= number) {
//            sum = sum + i;
//            i++;
//        }
//        System.out.println(sum);
//    }


    //26 Reverse of a number
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int number = sc.nextInt();
//        int reverse = 0;
//
//        while (number!=0) {
//            int result = number % 10;
//            reverse = reverse * 10 + result;
//            number = number/10;
//        }
//        System.out.println("Reverse of number is : " + reverse);
//    }


    //15th factorial of a number
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int number = sc.nextInt();
//
//        int factorial = 1;
//
//        if(number <=1) {
//            System.out.println("Factorial of the number is : " + 1);
//            return;
//        }
//
//        if(number == 2) {
//            System.out.println("Factorial of the number is : " + 2);
//            return;
//        }
//
//        while(number !=0) {
//            factorial = factorial * number;
//            number--;
//        }
//        System.out.println("Factorial of the number is : " + factorial);
//    }

    //16th Sum of all numbers from 1 to n
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int number = sc.nextInt();
//        int sum = 0;
//
//        if(number == 1 || number == 0) {
//            System.out.println(number);
//            return;
//        }
//        while(number !=0) {
//            sum = sum + number;
//            number--;
//        }
//        System.out.println(sum);
//    }

    //17th sum of given digits
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int number = sc.nextInt();
//        int sum = 0;
//        int result = 0;
//
//        if(number / 10 <= 0) {
//            System.out.println(number);
//            return;
//        }
//
//        while(number != 0) {
//            result = number % 10;
//            sum = sum + result;
//            number = number/10;
//        }
//        System.out.println(sum);
//    }

    //18th Armstrong number
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int ArmstrongCheck = sc.nextInt();
//        int number = ArmstrongCheck;
//        int sum = 0;
//        int result = 0;
//        int digits = String.valueOf(ArmstrongCheck).length();
//
//        while(number !=0) {
//            result = number % 10;
//            sum = sum + (int)Math.pow(result, digits);
//            number = number/10;
//        }
//        if(sum == ArmstrongCheck)
//            System.out.println("Number is armstrong");
//        else
//            System.out.println("Number is not armstrong");
//    }


    //19th Perfect number
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int number = sc.nextInt();
//        int sum = 0;
//       for(int i=1; i<=number/2; i++) {
//           if(number % i ==0) {
//               sum += i;
//           }
//       }
//        if(sum == number) {
//            System.out.println("Number is perfect");
//        }
//        else
//            System.out.println("Number is not perfect");
//    }

    //20th Strong number
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int StrongNumber = sc.nextInt();
//        int number = StrongNumber;
//
//        int sum = 0;
//        int result = 0;
//
//        while(number != 0) {
//            int fact = 1;
//            result = number % 10;
//            while(result > 0) {
//                fact = fact * result;
//                result--;
//            }
//            sum = sum + fact;
//            number = number /10;
//        }
//        if(sum == StrongNumber) {
//            System.out.println("Number is Strong");
//        }
//        else
//            System.out.println("Number is not Strong");
//    }

    //21 Square root of a number
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int number = sc.nextInt();
//
//        boolean isSquare = false;
//
//        if(number <= 3) {
//            System.out.println("Not a square");
//            return;
//        }
//
//        for(int i=1; i * i <= number; i++) {
//            if(i * i == number) {
//                isSquare = true;
//                break;
//            }
//        }
//
//        if(isSquare) {
//            System.out.println("Number is square");
//        }
//        else
//            System.out.println("Number is not a square");
//    }

    //22nd Perfect cube
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int number = sc.nextInt();
//
//        boolean isCube = false;
//
//        if(number <= 7) {
//            System.out.println("Not a Cube");
//            return;
//        }
//
//        for(int i=1; i * i * i <= number; i++) {
//            if(i * i * i == number) {
//                isCube = true;
//                break;
//            }
//        }
//
//        if(isCube) {
//            System.out.println("Number is Cube");
//        }
//        else
//            System.out.println("Number is not a Cube");
//    }

    //23rd Palindrome for numbers

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int givenNumber = sc.nextInt();
//
//        int number = givenNumber;
//
//        int reverse = 0;
//        int result = 0;
//
//        boolean isPalindrome = false;
//        while(number != 0) {
//            reverse = number % 10;
//            result = (result * 10) + reverse;
//            number = number/10;
//
//        }
//
//        if(result == givenNumber) {
//            isPalindrome = true;
//        }
//
//        System.out.println((isPalindrome? "Number is Palindrome" : "Number is not Palindrome"));
//
//    }

    //24th Fibonacci series
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int first = 0;
//        int second = 1;
//        int sum = 0;
//
//        while(n != 0) {
//            System.out.print(sum + " ");
//            first = second;
//            second = sum;
//            sum = first + second;
//            n--;
//        }
//    }

    //25th repeated digits in number
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int number = sc.nextInt();
//
//        boolean[] seen = new boolean[10];  // to track digits 0-9
//
//        int repeatedDigit = -1;
//        while (number > 0) {
//            int digit = number % 10;
//            if (seen[digit]) {
//                repeatedDigit = digit;
//                break; // stop once we find the first repeat
//            }
//            seen[digit] = true;
//            number = number / 10;
//        }
//
//        if (repeatedDigit != -1)
//            System.out.println("First repeated digit is: " + repeatedDigit);
//        else
//            System.out.println("No repeated digits found.");


    //26 Genrate Random String in particular format
//    public static void main(String[] args) {
//        String chars = "abcABC9876";
//
//        StringBuilder sb = new StringBuilder();
//
//        for(int i=0; i<10; i++) {
//            int index = (int) (Math.random() * chars.length());
//            sb.append(chars.charAt(index));
//        }
//        System.out.println(sb.toString());

        //another approach
//    import org.apache.commons.lang3.RandomStringUtils;

//        String random = RandomStringUtils.random(3, "abc")
//                + RandomStringUtils.random(3, "ABC")
//                + RandomStringUtils.random(4, false, true);

//        System.out.println(random);
//    }




}


