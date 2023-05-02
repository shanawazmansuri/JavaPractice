package basic;

public class Stat {
	
	static String firstName = "Nawaz";
	int age= 25;

	public static void main(String[] args) {
		
		//new keyword will create an object memory
		// Call Constructor
		Stat st = new Stat();
		
		System.out.println(st.firstName);
		st.person();
		
		//2 Methods to call static members
		//Static members can be called without creating objects
	//	person();
		//Stat.person();
		
		//System.out.println(firstName);
		//System.out.println(Stat.firstName);
		
		
		
	}
	
	public static void person()
	{
		System.out.println("My name is "+ firstName );
	}
	
	public void age()
	{
		System.out.println("Person Age is "+age);
	}

}
