package basic;

import java.util.LinkedList;
import java.util.List;

public class Linkedlst {

	public static void main(String[] args) {
		
		List ll = new LinkedList();
		
		//It is very fast as compared to arraylist when values are add/removed
		//Fetch the value will be very slow as compared to arraylist
		//Maintain INsertion Order
		//Add Null and Duplicate values
		
		ll.add("Dell");//0
		ll.add("Lenove");//1
		ll.add("Acer");//2
	
		
		ll.add(1, "Dell");
		
		ll.add(null);
		
		System.out.println(ll);

	}

}
