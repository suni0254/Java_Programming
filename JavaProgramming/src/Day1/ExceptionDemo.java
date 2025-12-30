package Day1;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Program started");
		Scanner sc = new Scanner(System.in);
		
		//Example-1====Arithmetic exception
		/*
		System.out.println("Enter a number");	
		int num = sc.nextInt();
		System.out.println(100/num);	//Enter 0
		*/
		
		/*
		//Example-2====ArrayIndexOutOfBound Exception
		int a[] = new int[5];
		System.out.println("Enter the position(0-4)");  //Enter 5
		int pos = sc.nextInt();
		System.out.println("Enter the value");
		int value = sc.nextInt();
		a[pos] = value;
		*/
		
		/*
		//Example-3=======NumberFormatException
		String s = "welcome";	//Cannot convert with wrapper class
		System.out.println(Integer.parseInt(s));
		*/
		
		/*
		//Example-4=======NullPointException
		String s = null;
		System.out.println(s.length());
		*/
		
		System.out.println("Enter a number");	
		int num = sc.nextInt();
		try
		{
		System.out.println(100/num);	//Enter 0
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Invalid Input data");
			System.out.println(ae.getMessage());	//Will give detail info regarding exception
		}
		finally
		{
		System.out.println("Program completed");
		System.out.println("Program is exited");
		}
		
		sc.close();
		
		
		
	}

}
