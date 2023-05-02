package basic;

public class Overload {

	public static void main(String[] args) {
		
		Overload ov = new Overload();
		ov.tax(1000,"Shanawaz");

	}
	//Polymorphism
	//Compilation Type Polymorphism
	//Method overloading
	
	//methods Name (No Parameter) 
	//No of parameters (With Parameter)
	//sequence of parameters (With Parameter)
	public void tax()
	{
		System.out.println("I am default");
	}
	
	
	
	
	public void tax(int it)
	{
		System.out.println("Only IT "+it);
	}
	
	public void tax(int it, int gst)
	{
		System.out.println("IT and GST "+it+gst);
	}
	
	public void tax(int it, int gst, int vat)
	{
		System.out.println("IT and GST "+it+gst);
	}
	
	public void tax(int it, String taxPayerName)
	{
		System.out.println("Only IT and Tax PayerName is "+it+taxPayerName);
	}
	
	public void tax(String taxPayerName, int it)
	{
		System.out.println("Only IT and Tax PayerName is "+it+taxPayerName);
	}
	
	

}
