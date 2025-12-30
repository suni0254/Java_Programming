package Day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet myset = new HashSet();
		//Inserting Hetrogeneous Data into Hash Set
		myset.add(100);
		myset.add(10.45);
		myset.add("Welcome");
		myset.add('A');
		myset.add(true);
		myset.add(100);
		myset.add(null);
		myset.add(null);
		//Insertion Order not preserved; Duplicate elements can be avoided
		System.out.println("Printing HashSet of Elements: "+myset);
		
		//Size of Hash Set elements
		System.out.println("Size of Hash Set elements is:"+myset.size());
		
		//Inserting ,Updating Accessing elements in HashSet is not possible bcz Index is not followed in Hash Set
		//Accessing Specific element is not possible in HashSet but it is possible after converting int ArrayList
		//Removing multiple element is not possible in HashSet bcz Index is not allowed
		
		//Remove Specific Element
		myset.remove(10.45);
		System.out.println("Printing HashSet Elements after removing element: "+myset);
		
		//After Convertign from HashSet to ArrayList we can perform Accessing Elements
		System.out.println("Accessign specific element after conveting from HashSet to Array List");
		ArrayList ar1 = new ArrayList(myset);
		System.out.println(ar1.get(2));
		
		//Reading all elements using 'for-each' loop but it is not possible using for loop bcz index is not allowed
		System.out.println("Printing HashSet elements using For each loop: ");
		for(Object x:myset)
		{
			System.out.println(x);
		}
		
		//Reading all elements using 'Iterator' 
		System.out.println("Printing HashSet elements using Iterator: ");
		Iterator itr = myset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		//Checking HashSet is empty or not
		System.out.println("Is HashSet is Empty? "+myset.isEmpty());
		
		//Removing all the elements in HashSet
		System.out.println("After Removing all the elements in HashSet ");
		myset.clear();
		System.out.println("Is Hash Set empty? "+myset.isEmpty());	
	}

}
