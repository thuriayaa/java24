package day9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	
	/**
	 * HashSet - a class implemented set interface
	 * 
	 * 1. heterogeneous data --> allowed
	 * 2. insertion order --> not preserved (index not supported)
	 * 3. duplicate elements --> not allowed
	 * 4. multiple nulls --> not allowed / only single null is allowed
	 * 
	 * Hashset use hashing technique to save the data
	 */
	
	
	public static void main (String[] args) {
		
/**
 * 
//Declaring HashSet
		
//method 1: 
		
	HashSet myset = new HashSet(); 
	
//method 2:
		
	Set myset2 = new HashSet();
	
//method 3: 
	
	HashSet <Integer> myset3 = new HashSet <Integer> (); //unless you will use only int data, do not specify, keep the data type open for any
	
*/
		
		
	HashSet myset = new HashSet(); 
		
//add elements into the HashSet
	
	myset.add(100);
	myset.add(10.5);
	myset.add("Selenium");
	myset.add(true);
	myset.add('A');
	myset.add(100);
	myset.add(null);
	myset.add(null);  //duplicates are not allowed but you won't see errors until you print where the duplicates will not show. 
	
//printing myset
	
	System.out.println("My set is " + myset); //order of the insertion is not preserved, so items come random. 
	
// size of HashSet
	
	System.out.println("My set size is " + myset.size()); //does not count duplicates 
		
//remove elements from hashset - specify the value to be removed as there is no index value #
	
	myset.remove(10.5); 
	
	System.out.println("My set is " + myset); //removed
	
	System.out.println("My set size is " + myset.size()); //size now is 5
	
/**
 * inserting an element is not possible but you can add as there is no order/specific location 
 * 
 * Accessing specific element is not possible but you can convert hashset into arraylist then use index to access elements
 * 
 * way around is by converting hashset into arraylist
 */
		
		ArrayList al = new ArrayList(myset); //convert hashset into an arraylist
		
		System.out.println("My hashset is now converted to arraylist: " + al);
		
		System.out.println(al.get(2)); //100
		
//reading all the elements from hashset - we cannot use traditional for loop as there is no index but we can use for each loop/enhanced loop
		
		for (Object y : myset) {
			System.out.print(y + " ");
		}
		
		System.out.println("\n");		

		
//using iterator
		
		Iterator <Object> it = myset.iterator();		
		
			while (it.hasNext()) {
				System.out.print(it.next() + " ");
			}
			System.out.println();

			System.out.println("Clearing all the values: " ); 
			
			myset.clear(); 
			
			System.out.println("My set is empty " + myset.isEmpty());
			
			System.out.println("My set is " + myset); //empty
			
			System.out.println("My set size is " + myset.size()); //none
			

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
