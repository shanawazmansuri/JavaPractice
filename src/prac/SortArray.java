package prac;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {
		
		int[] arr = {12,11,14,10};
		int[] arr1 = {12,11,14,10};
		
		boolean aa = Arrays.equals(arr, arr1);
		
		System.out.println(aa);
		
		//Arrays.parallelSort(arr);
		
		Arrays.sort(arr);
		
		//System.out.println(Arrays.toString(arr));
		
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
