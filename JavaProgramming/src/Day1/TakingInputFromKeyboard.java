package Day1;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("Enter a String");
		String str = sc.next();
		System.out.println("Given String is: "+str);
		*/
		
		/*
		//Adding of 2 numbers
		System.out.println("Enter Number1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Number2: ");
		int num2 = sc.nextInt();
		System.out.println("Addition of 2 Numbers is: "+(num1+num2));
		*/
		
		//Taking Unknown value at run time-------Important
		System.out.println("Enter Unknown Value: ");
		Object obj = sc.next();			//For any data it consider it as a string
		System.out.println("Given Unknown value is: "+ obj);
		
		sc.close();
		
	}

}
