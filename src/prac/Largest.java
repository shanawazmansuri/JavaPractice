package prac;

import java.util.Arrays;

public class Largest {

	public static void main(String[] args) {

		
		int array[] = { 44, 66, 34, 99, 77, 33, 22, 55, 12, 78 };
		
		  
	      int size = array.length;
	      Arrays.sort(array);
	      System.out.println("sorted Array ::"+Arrays.toString(array));
	      int max = array[size-4];
	      int min = array[size-8];
	      System.out.println("4th largest element is :"+max);
	      System.out.println("3rd smallest element is :"+min);
	   }

}
