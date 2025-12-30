package Day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		//List ar = new ArrayList();
		//ArrayList<Integer> ar = new ArrayList<Integer>();		//Store Homogeneous Data

		
		
		//Inserting Hetrogeneous elements into ArrayList
		ar.add(100);
		ar.add(10.45);
		ar.add("Welcome");
		ar.add('A');
		ar.add(true);
		ar.add(100);
		ar.add(null);
		ar.add(null);	
		System.out.println("Printing Elements of Array List"+ar);
		
		//Size of Array List
		System.out.println("Size of array list is:"+ar.size());
		
		//Inserting New Element into Existing Array List==then Index count will increase
		ar.add(5,250);
		System.out.println("Printing Elements after Inserting New element"+ar);
		System.out.println("Size of Array List after Inserting new Element:"+ar.size());		
		
		//Removing specific Element in Array List
		ar.remove(1);
		System.out.println("Printing Elements after Removing Element"+ar);
		
		//Modify Element in Array List
		ar.set(4,420);
		System.out.println("Printing Elements after modifying Element:"+ar);
		
		//Accessing Specific Element in Array List
		System.out.println(ar.get(4));
		
		//Reading all elements from Array List using 'for-loop'
		System.out.println("Reading All elements from the Array List using For loop:");
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		//Reading all elements from Array List using 'for-each loop'
		System.out.println("Reading all elements from the array list using for-each loop");
		for(Object x:ar)
		{
			System.out.println(x);
		}
		
		//Reading all elements from Array List using 'Iterator'
		System.out.println("Reading all elements from the array list using Iterator");
		Iterator it = ar.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Removing multiple elements from the ArrayList
		ArrayList removelist =  new ArrayList();
		removelist.add(null);
		removelist.add(100);
		ar.removeAll(removelist);
		System.out.println("Printing Remainging elements after removing: "+ar);
		
		//Checking Array List empty or not
		System.out.println("Is Array List Empty? "+ar.isEmpty());
		
		//Removing all the elements in ArrayList
		ar.clear();
		System.out.println("After Removing all the elements in ArrayList: ");
		System.out.println("Is Array List Empty? "+ar.isEmpty());	
	}

}
