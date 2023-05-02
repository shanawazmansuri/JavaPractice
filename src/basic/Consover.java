package basic;

public class Consover {
	//Constructor Overloading
	public Consover()
	{
		System.out.println("This is default Constructor");
	}
	
	public Consover(int it)
	{
		System.out.println("With IT");
	}
	
	public Consover(int it, String taxPayer)
	{
		System.out.println("With IT with Tax Payer");
	}
	
	public Consover(String taxPayer, int it)
	{
		System.out.println("With Tax Payer and IT");
	}

	public static void main(String[] args) {

		Consover cs = new Consover(1200,"Nawaz");
	}

}
