package basic;



public class Looping {

	public static void main(String[] args) {
		
		

		Looping lp = new Looping();
		// lp.case1();
		// lp.case2();
		//lp.case3();
		//lp.case4();
		lp.case5();
	}

	// 3 Loops
	// For Loop
	// while Loop
	// Do While Loop
	// ForEach Loop
	public void case1() {

		// INitialization
		// Condition
		// Increment/Decrement

		// INitialize (Only for 1st time)
		// First Increment/Dec then it will check the condition
		// i = i+1;

		/*
		 * for (int i = 1; i <= 10; i++) { System.out.println("My Name is Shanawaz"); }
		 */

		int[] ar = new int[4];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;

		for (int i = 0; i < ar.length; i++) {

			System.out.println(ar[i]);
		}

	}

	public void case2() {
		// while
		// It will run only if condition is fulfilled/true
		int a = 1;
		while (a <= 10) {
			System.out.print(a);
			a++;
		}
	}

	public void case3() {
		// do while
		// It will run only if condition is fulfilled/true
		// If condition will not be fulfulled then at least it will exeute the code 1
		// time
		int a = 0;
		do {
			System.out.println(a);
			a++;
		} while (a > 10);
	}

	public void case4() {

		// For Each (Advance)

		String[] st = { "Blue", "Green", "Yellow", "Red" };

		for (String newst : st) 
		{
			System.out.println(newst);
		}
	}
	
	public void case5() {
		
		//Row = 0 
		int  ar [][]= {{12,13,14},{15,16,17}};
		
		for(int row=0;row<ar.length;row++)
		{
			for(int col=0;col<ar[row].length;col++)
			{
				System.out.print(ar[row][col]);
			}
			
	}
	}
	
}