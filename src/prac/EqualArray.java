package prac;

import java.util.Arrays;

public class EqualArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3 };
		
		boolean status = Arrays.equals(a, b);

		System.out.println(status);

	}

}
