package Day1;

import java.util.Arrays;
import java.util.Comparator;

public class SortingElementsArrays {

	public static void main(String[] args) {
		
		//Sorting Integers
		int a[] = {100,900,300,200,600,500};
			
		System.out.println("Before Sorting: "+Arrays.toString(a));
		Arrays.sort(a);	//Sort Elements in a Array
		System.out.println("After Sorting: "+Arrays.toString(a));
		
		
		//Sorting Strings
		String str[] = {"sunil","ravi","anil","kiran"};
			
		System.out.println("Before Sorting: "+ Arrays.toString(str));
		Arrays.sort(str);	//Sort Elements in a Array
		System.out.println("After Sorting: "+Arrays.toString(str));
		
		//Sorting numbers(Ascending) in String format
		String[] prices = {"100", "20", "5", "50"};
		Arrays.sort(prices, Comparator.comparingInt(Integer::parseInt));
		System.out.println(Arrays.toString(prices));			//[5, 20, 50, 100]
			
	}

}
