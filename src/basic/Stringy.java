package basic;

public class Stringy {

	// String is a class
	// We can use String as Datatype
	// String is immutable (Non Changable)
	public static void main(String[] args) {
		Stringy st = new Stringy();
		// st.case1();
		//st.case2();
		st.case3();

	}

	public void case1() {

		// First Method
		// New Memory allocate
		// m1
		String str = new String("Shanawaz");

		// m4
		String str1 = new String("Shanawaz");

		// Second Method
		// m2
		String str2 = "Shanawaz";
		String str3 = "Shanawaz";

		String str4 = "Shanawaz";
		String str5 = "Nawaz";

	}
	
	public void case2()
	{
		//String str = new String("Shanawaz");
		
		String str1 = "10-Aug-2022";
		//String str2 = "Nawaz";
		
	//	System.out.println(str1.charAt(1));
		//System.out.println(str1.concat(" Mansuri"));
		//System.out.println(str1.compareTo("Shanawaz"));
		//System.out.println(str1.compareToIgnoreCase("shanawaz"));
		//System.out.println(str1.contains("nawaz"));
		//System.out.println(str1.length());
		//System.out.println(str1.toUpperCase());
		//System.out.println(str1.toLowerCase());
		//System.out.println(str1.equals("Shanawazuuuu"));
		//System.out.println(str1.equalsIgnoreCase("shanawaz"));
		//System.out.println(str1.substring(3));
	//	String[] arr = str1.split("-");
		//System.out.println(arr[0]);
		//System.out.println(arr[1]);
		//System.out.println(arr[2]);
		
	//int a = 10;
	//String ss = String.valueOf(a);
	
	//System.out.println(ss);
	
		
		
		//
		//Rs
		//100
		
		
		
		
		
	}
	
	public void case3()
	{
		
		String st = "Tom";
		String st1 = "Tom";
		
		String str = new String("Tom");
		String str1 = new String("Tom");
		
		System.out.println(str==str1);
		
		//System.out.println(st.equals(str));
		
		
		
		
	}

}
