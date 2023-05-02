package basic;

public class Conversion {

	public static void main(String[] args) {

		Conversion con = new Conversion();
		//con.test1();
		con.test2();

	}

	public void test1() {
		int a = 10;
		long l = a;

		System.out.println(l);
		// Value has been converted to long
		float f = l;
		System.out.println(f);

	}
	
	public void test2() {
		float f = 10.10f;
		
		int i = (int)f;
		System.out.println(i);
		

	}

	// Converting one datatype to another datetype
	// 2 Types
	// 1 Implicit conversion (Widening)
	// byte,short,char,int,long, float,double
	// JVM internally autmotically converts your conversion

	// 2 Explicit Conversion (Narrowing)
	//double, float, long,int,char, short, byte
	//Explicitely you have to convert the datatype
	//Data Loss

}
