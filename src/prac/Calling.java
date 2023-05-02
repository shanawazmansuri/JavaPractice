package prac;

//Properties importing from other package needs to be import
//import starts with import keyword followed by packagename.classname 
//import basic.Condition;
//* means All
import basic.*;

public class Calling extends Prot {
	
	

	public static void main(String[] args) {
		
		Prot pr = new Prot();
		
		Calling  cal = new Calling();
		System.out.println(cal.val);
		cal.proMethod();
		
		

	}
	
	
	

}
