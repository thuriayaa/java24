package day9;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main (String[] args) {

/**
 * HashMap Attributes
 * 1. data can be stored in the form of key, value pairs.
 * 2. key is unique. But we can have duplicate values.
 * 3. Insertion order not preserved (index is not followed). 
 * 
 */
		
		
		
//declaring hashmap 
		

//method 1: 
		
		HashMap hm3 = new HashMap();
		
//method 2: 
		
		Map hm2 = new HashMap();
		
//method 3: 
		
		HashMap<Integer, String> hm = new HashMap<Integer, String> ();
		
//adding pairs 
		
		hm.put(101, "Smith");
		hm.put(102, "Sorot");
		hm.put(103, "Jain");
		hm.put(104, "Mohora");
		hm.put(104, "Jain");
		hm.put(102, "Mohua");
		
//printing hashmap
		
		System.out.println("My Hashmap is: " + hm); //duplicate key is not allowed but duplicate value is allowed
		
//finding out size
		
		System.out.println("My hashmap size is: " + hm.size());
		
//remove a pair
		
		hm.remove(104);
		
		System.out.println("My Hashmap is: " + hm); //prints in { } 
		
		System.out.println("My hashmap size is: " + hm.size());
		
//get all the keys of a hashmap
		
		System.out.println(hm.keySet());
		
//get all the values 
		
		System.out.println(hm.values() + "\n");
		
		System.out.println("All the entries: " + hm.entrySet() + "\n"); //this prints as a set with [ ] . 
		
/*
 * read all the elements of a hashmap: key and value. 
 * keyset method returns all the keys, if we return all keys, we can use a key to get its value
 */
		
		
		
		for (int k : hm.keySet()) {
			
			System.out.println(k + " " + hm.get(k));
			
		}
		
		
		
		
	}
	

}
