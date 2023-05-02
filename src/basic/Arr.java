package basic;

public class Arr {

	// Array is object of multiple elements of same datatype
	public static void main(String[] args) {

		Arr array = new Arr();
		//array.case1();
		array.case2();

	}

	public void case1() {
		// 2 ways to create an array
		// 1 method

		int[] ar = new int[4];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;

		// 2 Method
		int[] ar2 = { 11, 12, 13, 14 };

		System.out.println(ar2[2]);
	}
	
	public void case2()
	{
		//2 ways to create 2d Array
		//First box indicates rows
		//Second box indicates columns
		
		//First Method
		int [][] arr = new int[2][3];
		arr[0][0] = 22;
		arr[0][1] = 33;
		arr[0][2] = 44;
		arr[1][0] = 55;
		arr[1][1] = 66;
		arr[1][2] = 77;
		
	
		//2 Method
		//2 Rows
		//2 Columns
		int  ar [][]= {{12,13,14},{15,16,17}};
		
		System.out.println(ar[0][2]);
	}

}
