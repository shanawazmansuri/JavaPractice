package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArrayList {

	public static void main(String[] args) {
		
		List<Integer> lst = Arrays.asList(1,3,4,5,5,6,7,7);
		
		int[]a= {1,2,3,4,4,5,6,7,7}; 
		
		Set <Integer> st = new HashSet<Integer>(lst);
		
		System.out.println(st);

	}
	
	

}
