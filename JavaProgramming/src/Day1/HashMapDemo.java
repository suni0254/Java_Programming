package Day1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		//Declaration
		HashMap hm = new HashMap();
		//Map hm = new HashMap();
		
		//HashMap<Integer, String> hm = new HashMap<Integer, String>();	//Storing specific Key value pair type
		
		//Adding Pairs(Key-value) in HashMap
		hm.put(101, "John");
		hm.put(102,"Scott");
		hm.put(103, "Mary");
		hm.put(104, "Scott");
		hm.put(105, null);
		System.out.println("Printing HashMap elements:"+hm);		//In the form of List{}
		
		//Size of HashMap Elements
		System.out.println("Size of Hash Map elements is: "+hm.size());
		
		//Accessing Value of Key
		System.out.println("Accessing Value of Key:"+hm.get(104));
		
		//Updating value of key---is not possible
		
		//Remove specific pair
		System.out.println("Removing specific pair:"+hm.remove(105));
		System.out.println("Key Value pair after removing:"+hm);
		
		//Get all the keys from HashMap
		System.out.println(hm.keySet());   		//[101, 102, 103, 104]
		System.out.println(hm.values());		//[John, Scott, Mary, Scott]
		System.out.println(hm.entrySet()); 		//[101=John, 102=Scott, 103=Mary, 104=Scott] in the form os Set[]
		
		//Insert the key which is already deleted
		hm.put(105,"Ravi");
		System.out.println("Printing all the elements after inserting the key which is already deleted"+hm.entrySet());
		
		//Reading Data from HashMap using For each loop
		for(Object x:hm.keySet())
		{
			System.out.println(x+"  "+hm.get(x));
		}
		
		//Reading Data from HashMap using Iterator
		Iterator it= hm.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Checking hashmap is empty or not
		System.out.println("Is hashmap empty?:"+hm.isEmpty());
		hm.clear();
		System.out.println("after removing all the data form hashmap");
		System.out.println("Is hashmap empty?:"+hm.isEmpty());
	}

}
