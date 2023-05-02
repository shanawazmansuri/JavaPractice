package basic;

public class Child extends Parent{

	public static void main(String[] args) {
		
		
		//Runtime Polymorphism
		//Method overriding
		
		//First Scenario Child Object
		// Auto Parent Constructor call
	/*	Child ch = new Child();
		ch.add();
		ch.sub();
		ch.multiply();*/
		
		
		//Second Scenario Parent Object
		// Will not be access Child class members
		/*
		 * Parent par = new Parent(); par.add();
		 */
		
		//Third Scenario Parent Object
		//Reference is Parent hence will access to parent class members
		//Runtime it will override to child method
		Parent pr = new Child();
		pr.add();
		pr.multiply();
		
		
		
		//Forth Scenario
		//This is not allowed in java
		///compilation time error
		//Child child = new Parent();
		
		
		//Is a Relationship
		// Parent Child relationship
		
		
		//Single Level Inheritance
		//Multiple Inheritance // Not allowed
		// Multi Level Inheritance 
		// Hierarchy level Inheritance
		
		

	}
	
	public void add()
	{
		System.out.println("Into Child Add Method");
	}
	
	public void sub()
	{
		System.out.println("Into Child Sub Method");
	}
	
	public void div()
	{
		System.out.println("Into Child Div Method");
	}

}
