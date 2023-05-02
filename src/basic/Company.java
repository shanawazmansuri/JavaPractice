package basic;

public class Company {
	
	int regNo;
	String companyName;
	//Class reference 
	Address add;
	
	
	public static void main(String[] args) {
		
		Address ad = new Address("Noida", "New Delhi", 360001);
		Company em = new Company(123456, "ABC Infotech", ad);	
		em.companyDetails();
		
	}
	
	
	
	public Company(int regNo, String companyName, Address add)
	{
		this.regNo = regNo;
		this.companyName = companyName;
		this.add = add;
	}
	
	
	public void companyDetails()
	{
	
		System.out.println(regNo+" "+companyName+" "+add.city+" "+add.state+" "+add.pinCode);
	}
	
	//has a relationship
	//if a class has an entity reference
	// Code Reusability
	
	
	//emp
	//Emp Id
	//Emp Name
	
	//Address
		// City
		//State
		//Country
		//Pin
	
	
	//INfosys
		//Company Name
		// Reg No
		// Address
			// City
			//State
			//Country
			//Pin

}
