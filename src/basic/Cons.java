package basic;

public class Cons {
	
	String name;//Shanawaz 
	int age; // 25
	String profile = "SDET";
	static String designation = "SE";
	
	//DEFAULT CONSTRUCTOR IS CREATED BY jvm AT RUNTIME
	// Constructor is block of code that will be executed 
	//	at the time of creating the object
	
	//2 Constructor
	//1. Default
	//2. Parameterized Constructor
	
	//2 Types of blocks
	//1. Instance Block
	//2. static block
	
	//INstance Block
	{
		System.out.println("I am inside Instance Block");
		System.out.println("His Profile is "+ profile);
		
	}
	
	{
		System.out.println("I am inside Instance Block 2");
		System.out.println("His Profile 2 is "+ profile);
		
	}
	
	static {
		
		System.out.println("I am inside static Block");
		System.out.println("His Profile is "+ designation);
		
	}
	
static {
		
		System.out.println("I am inside static Block 2");
		System.out.println("His Profile 2 is "+ designation);
		
	}
	

	
	
	
	public Cons(String name, int age)
	{
		
		  this.name = name; 
		  this.age = age;
		 
		
		/*
		 * name = name1; age = age1;
		 */
	}

	public static void main(String[] args) {
		
		//Default constructor call
		
		  Cons per1 = new Cons("Shanawaz",25); per1.person();
		 
		
		/*
		 * Cons per2 = new Cons("Mansuri",12); per2.person();
		 */

	}
	
	public void person()
	{
		System.out.println("Person Name is "+name);
		System.out.println("Person Age is "+age);
	}
}
