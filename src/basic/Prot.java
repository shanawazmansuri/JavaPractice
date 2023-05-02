package basic;

public class Prot {
	
	public Prot()
	{
		System.out.println("I am into Constructor");
	}
	
	protected int val = 10;
	
	public static void main(String[] args) {
		
	}

	protected void proMethod()
	{
		System.out.println("I am into protected Method of different class");
		
	}
	
}
