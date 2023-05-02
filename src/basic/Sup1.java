package basic;

public class Sup1 {
	
	int age = 20;
	
	Sup1()
	{
		System.out.println("Parent Class Default Constructor");
	}
	
	Sup1(int a)
	{
		System.out.println("Parent Class single param Cons");
	}
	
	Sup1(int a, String name)
	{
		System.out.println("Parent Class double datatype param Cons");
	}
	
	Sup1(String a, int b)
	{
		System.out.println("Parent Class String a and int b");
	}
	
	Sup1(int a, int b)
	{
		System.out.println("Parent Class double param Cons");
	}
	
	
	public void case1()
	{
		System.out.println("Parent case 1");
	}
	
	public void case2()
	{
		System.out.println("Parent case 2");
	}

}
