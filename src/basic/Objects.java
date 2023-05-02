package basic;

public class Objects {
	
	//Default COnstructor
	public Objects()
	{
		
	}

	// Instance class members
	String name = "Shanawaz";
	int rollNo = 25;

	public static void main(String[] args) {

		// Class members access
		Objects st1 = new Objects();
		// st1.studentData();
		System.out.println(st1.name);
		System.out.println(st1.rollNo);

	}

	// Class Members
	void studentData() {
		System.out.println("Students name is " + name);
		System.out.println("Students rollNo is " + rollNo);

	}

}
