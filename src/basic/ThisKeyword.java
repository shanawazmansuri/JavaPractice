package basic;

public class ThisKeyword {

	String name;
	int age;
	
	//Constructor Chaining
	public ThisKeyword()
	{
		this(11);
		System.out.println("In Default Cons");
	}
	
	public ThisKeyword(int a)
	{
		System.out.println("In 1 para Cons");
	}

	public ThisKeyword(int a, int b) {
	
		this();
		System.out.println("Into 2 para Cons");
	}

	public static void main(String[] args) {

		// This keyword current class object represent
		ThisKeyword th = new ThisKeyword(11,22);
		//th.case1();

	}

	// Select Product
	// this.Login

	public void case1() {
		this.case2(12);
		System.out.println("Case 1");
	}

	public void case2(int a) {
		this.case3(11, 12);
		System.out.println("Case 2");
	}

	public void case3(int a, int b) {

		System.out.println("Case 3");
	}

}
