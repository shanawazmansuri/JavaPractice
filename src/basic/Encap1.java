package basic;

public class Encap1 {

	public static void main(String[] args) {
		
		
		Encap1 enn = new Encap1();
		enn.getCustomerDetails();
		
		

	}
	
	public void getCustomerDetails()
	{
		
		Encap en = new Encap();
		en.setAccHolderName("Shanawaz");
		en.setAccNo(123456);
		en.setAtmPin(1234);
	
		System.out.println("Customer Name is "+ en.getAccHolderName());
		System.out.println("Customer Account No is "+ en.getAccNo());
		System.out.println("Customer ATM Pin is "+en.getAtmPin());
		
	}

}
