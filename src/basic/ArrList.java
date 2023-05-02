package basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrList {

	public static void main(String[] args) {
		
		
		// ArrayList dymamic array used to stored/remove/modify elements
		//INsertion order maintain
		//generic is used to specify array datatype to be stored
		//Iterator is used to iterate the values from the list
		//It will take time when data is inserted/deleted between indexes
		//It will work fast when data is fetched as compared to linkedlist
		
		ArrayList<Object> list = new ArrayList<Object>();
		//Iterator
		list.add("Shanawaz");//0
		list.add(12);//1
		list.add("Green");//2
		list.add("Mansuri");//3
		
		list.add(1, 25);
		
		
		
//		Object[] obj = list.toArray();
	//	System.out.println(obj[0]);
		
	/*
	 * list.clear(); System.out.println(list);
	 */
		
	/*
	 * for(int i=0; i<list.size();i++) { System.out.println(list.get(i));
	 * 
	 * }
	 */
		
	Iterator it =list.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	}

}
