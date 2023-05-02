package basic;

import prac.Calling;

public class Access {
	
	
	


	public static void main(String[] args) {
		
		//Parent pp = new Parent();
		//System.out.println(pp.a);
		//pp.add();
		
		
		Accessing acc = new Accessing();
		acc.def();
		System.out.println(acc.newage);
		
		//Calling cal = new Calling();
		///cal.defpack();
		//System.out.println(cal.a);
				
		
		//4 access modifiers
		//public, private, protected and default
		//public - Accessible through project
		//private - Access within class
		//protected - Within package/Across package is access thru child class
		// default - Access within package
		
		
		//Class Level (public or default)
		//Variable level
		//Method level
		//Constructor (Private- Not able to create object and inherit)

	}
	
	

}
