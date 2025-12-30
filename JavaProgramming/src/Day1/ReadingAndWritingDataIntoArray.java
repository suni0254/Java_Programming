package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArray {

	public static void main(String[] args) {
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter a Value for the position "+i+": ");
			a[i] = sc.nextInt();
					
		}
		System.out.println("Printing all the values in the array :"+Arrays.toString(a));		//which will convert arrays into human readable string format

		sc.close();
	}

}
