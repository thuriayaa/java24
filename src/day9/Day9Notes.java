package day9;

public class Day9Notes {
	
	/**
	 * to declare an interface 
	 * 
	 * syntax is: 
	 * 
	 * public interface I1 {
	 * 
	 * }
	 * 
	 * public interface I2 {
	 * 
	 * } 
	 * 
	 * public class multipleInterface implements I1 , I2  {
	 * 
	 * } 
	 * 
	 * 
	 */
	
	/*
	 * Today we are learning about Collection FrameWork
	 * 
	 * collection represent group of data in a single unit. array represent primitive data. collection holds object type data. 
	 * to handle object type data, java created collection. collection holds objective or reference data types. collection is interface. 
	 * 
	 * interface contains abstract methods, default, and static methods. collection interface can contain other interfaces
	 * 
	 * collection (I)
	 * 	1. list(I) <- ArrayList(C) : list is implemented by Arraylist class
	 *  2. Set(I)  <- HashSet(C) : set is implemented by hashset
	 *  
	 *  
	 *  Collection Framework: 
	 *  
	 *  1. collection - to represent group of elements/ objects/data into single entity
	 *  
	 *  "collection" is an interface available in java.util
	 *  
	 *  ArrayList - is class which is implemented List Interface
	 *  1. heterogeneous data - allowed
	 *  2. insertion order - preserved (index)
	 *  3. duplicate elements - allowed
	 *  4. multiple nulls - allowed - (more than one null can be hold)
	 *  
	 *  Arraylist will use index technique to save data, orderly, can save duplicate data, 
	 *  hashset will save data without any order
	 *  
	 * 
	 * 
	 */
	
	/**
	 * Planning Time
	 * - an event is starting at 10 AM in the morning
	 * - backward calculation
	 * - 10 AM -> prep time 5 mins
	 * 		   -> Travel time --> 1 hr. must leave at 8:55 AM --> 
	 * 		   -> dress up    --> 30 min. Start dressing at 8:25 AM -->
	 * 		   -> breakfast   --> 30 min. Start eating at 7:55 AM -->
	 *         -> Morning Prep --> 30 min. Start from 7:25 AM -->
	 *         -> Wake up 	   --> 15 min. Start at 7:10 AM --> 
	 *         -> Sleep time   --> 6 hrs.  Sleep by 1:10 AM --> 
	 * 
	 */

	/*
	 * Hashmap - follows hashset technique of hashing
	 * hashmap is a class implements map interface 
	 * 
	 * 
	 */
	
}
