package basic;

abstract public class Scooter {
	
	int tyre;//2
	int seater;//3
	static String name;

	
	//tyre = 2
	//seater = 3
	
	public Scooter(int tyre, int seater)
	{
		this.tyre = tyre;
		this.seater = seater;
		
	}
	
	public Scooter()
	{
		System.out.println("Abs Class Default Constructor");
		
	}

	
	
	public void tyres()
	{
		//2
		//
		System.out.println("Having Tyres as "+tyre+" Having Seater as "+seater);
	}
	
	public void type()
	{
		System.out.println("Having only Petrol option");
	}
	
	
	
	abstract public void engine();
	
	
	public void speed()
	{
		System.out.println("Having MAx 100 KMH Speed");
	}
	
	abstract public void charging();
	

}
