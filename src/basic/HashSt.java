package basic;

import java.util.HashSet;
import java.util.Set;

public class HashSt {

	//It accepts only unique values
	//It does not maintain insertion order
	
	public static void main(String[] args) {
		
		Set <Object>hs = new HashSet<Object>();
		hs.add("Winter");
		hs.add("Summer");
		hs.add("Monsoon");
		hs.add(12);
		hs.add(25);
		
		System.out.println(hs);

	}

}
