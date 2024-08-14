package day9;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main (String[] args) {

/**	
 * 
//declaration of ArrayList: 3 ways to do so.  

//method 1: 
	
	ArrayList mylist = new ArrayList<>();
	

//method 2: 
	
	List mylist2 = new ArrayList();
	
//method 3: 
	
	ArrayList <String> mylist3 = new ArrayList<String>();
	
*/
	
	ArrayList mylist = new ArrayList<>();
	
	
//Adding data into an arrayList, b/c it is an object, we will use .add method
	
	mylist.add(100); 
	mylist.add(10.5);
	mylist.add(100);
	mylist.add("Welcome");
	mylist.add('A');
	mylist.add(false);
	mylist.add(100);
	mylist.add(null);
	mylist.add(null);
	mylist.add(100);

	
//size of arraylist
	
	System.out.println("The size of mylist is " + mylist.size());//9
	
//printing arraylist
	
	System.out.println("My list >> " + mylist);
	
//removing elements from the list: add the index value to remove that index value
	
	mylist.remove(8); 
	
//insert/add a new element in the arraylist
	
	mylist.add(700); //add to the list as the last index item
	
	System.out.println("My list >>" + mylist); 
	
	mylist.add(2, "Selenium"); //this will be the 10th item in the list
	
	System.out.println("My list >>" + mylist); 

//modify a value
	
	mylist.set(3, "java"); 
	
	System.out.println("My list >>" + mylist); 

//accessing a specific element from the list
	
	System.out.println(mylist.get(1));
	
		//********** Retrieving all the elements from the arraylist *************

/**
//using traditional for loop
	
	for (int i=0; i < mylist.size(); i ++) {
		System.out.println(mylist.get(i) + " "); 
	}


//using for each loop
	
	for (Object x : mylist) {
		System.out.println(x);
	}
	
// using iterator 
	
	Iterator <Object> it = mylist.iterator(); //can remove <object> also, keep or delete both are ok
	
		while(it.hasNext()) {
			System.out.print(it.next() + " "); //.hasNext and .Next work together. 
		}

*/
	
// check if the list is empty or not
	
	System.out.println("My list is empty: " + mylist.isEmpty());
	
// remove multiple items from the list
	
	ArrayList mylist2 = new ArrayList(); 
	
	mylist2.add(100);
	mylist2.add(10.5);
	mylist2.add("Selenium");
	
	mylist.removeAll(mylist2);
	
	System.out.println("My list >>" + mylist); 
	
//to clear the entire arraylist
	
	mylist.clear();
	
	System.out.println("My list is empty: " + mylist.isEmpty()); //true

	System.out.println("My list >>" + mylist); 

	


}
}
