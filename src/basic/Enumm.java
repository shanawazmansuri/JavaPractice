package basic;

enum Days{
	SUNDAY,MONDAY,TUESDAY
	
}

public class Enumm {
	
	

	public static void main(String[] args) {
		
		Enumm en = new Enumm();
		en.case2();
		Days da = Days.MONDAY;

	}

	public void case1() {
		Colors cl = Colors.BLUE;

		/*
		 * if(cl.equals("Blue")) { System.out.println("Its a sky"); }
		 */

		switch (cl) {
		case BLUE:
			System.out.println("Its a Sky");
			break;
		}

	}
	
	public void case2()
	{
		Colors[] col = Colors.values();
		//System.out.println(col[1]);
		
		/*
		 * int green = Colors.GREEN.ordinal(); System.out.println(green);
		 */
		

		int blueOr = Colors.BLUE.ordinal();
		System.out.println(blueOr);
		System.out.println(col[0]);
		
		/*
		 * for(Colors color :col) { System.out.println(color); }
		 */
		
		
	}

}
