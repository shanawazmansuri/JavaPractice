package basic;

// getting the feature/properties from superclass/parent to child/subclass
// Code usability
// By creating object of child
// by writing the keyword extend
//private member they cannot be inheritited

public class Parent {
	
	public int a = 10, b = 20;
	
	/*
	 * public Parent() { System.out.println("I am in Parent Constructor"); }
	 */
	
	
	public void add()
	{
		System.out.println("Parent Add Method");
	}
	
	public void sub()
	{
		System.out.println("Parent Sub Method");
	}
	
	public void multiply()
	{
		System.out.println("Parent Mul Method");
	}

}
