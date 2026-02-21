package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PracticeJava {

	public static void main(String[] args) {
		String[] priceStrings = {"$100", "$20", "$5", "$50"};
		System.out.println("Original Prices are"+Arrays.toString(priceStrings));
		List<String> afterRemoveSymbols = new ArrayList<String>();
		for(String symbol : priceStrings)
		{
			afterRemoveSymbols.add(symbol.replaceAll("[^0-9.]", ""));
		}
		System.out.println("Prices after removing symbols" +afterRemoveSymbols);
		List<Integer> priceIntegers = new ArrayList<Integer>();
		for(String price:afterRemoveSymbols)
		{
			priceIntegers.add(Integer.parseInt(price));
		}
		System.out.println("After converting to Number Format "+priceIntegers);	
		Collections.sort(priceIntegers);
		System.out.println(priceIntegers);
		Collections.sort(priceIntegers,Collections.reverseOrder());
		System.out.println(priceIntegers);
		
	}
}