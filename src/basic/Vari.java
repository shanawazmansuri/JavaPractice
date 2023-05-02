package basic;

public class Vari {
	
	//Global Variable
	//Non Static
	//Instance Variable
	//range throughtout class
	String name = "Shanawaz";
	//Not Instantiated
	String lastName;
	static int age;
	
	

	

	public static void main(String[] args) {
		
		Vari obj1 = new Vari();
		obj1.person();
		

	}
	
	
	public void person()
	{
		//Local Variable
		String qual;
		
		System.out.println("Person Name is "+name);
		System.out.println("Person Name is "+lastName);
		System.out.println("Person Age is "+age);
		//System.out.println("Person Qualification is "+qual);
	}
	
	public static void personAddDet()
	{
		
		System.out.println("Age is "+age);
	}

}
