package basic;

public class Employee {
	
	int empId;
	String empName;
	//Class reference 
	Address add;
	
	
	public static void main(String[] args) {
		
		Address ad = new Address("Mumbai", "Maharashtra", 400003);
		Employee em = new Employee(1378661, "Shanawaz", ad);	
		em.empDetails();
		
	}
	
	
	
	public Employee(int empId, String empName, Address add)
	{
		this.empId = empId;
		this.empName = empName;
		this.add = add;
	}
	
	
	public void empDetails()
	{
	
		System.out.println(empName+" "+empId+" "+add.city+" "+add.state+" "+add.pinCode);
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
