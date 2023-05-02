package basic;

public class Func {
	
	

	public static void main(String[] args) {
		
		Func f1 = new Func();
		f1.firstName("Shanawaz", "Mansuri");
		//1st method
		System.out.println(f1.tax(313,12,25));
		
		///2nd Method
		/*
		 * int finalTax = f1.tax(); 
		 * System.out.println(finalTax);
		 */
		
		
		
		

	}
	
	//void
	// Not return anything
	// No output no print
	public void firstName(String firstName, String lastName)
	{
		System.out.println("My Full Name is "+ firstName+ " "+lastName);
		
	}
	
	
	//Output exists hence you can print
	public int tax(int st, int vat, int gst)
	{
		//int st = 125;
		//int vat = 245;
		//int gst = 175;
		
		int totalTax = st+vat+gst;
		return totalTax;
		
	}

}
