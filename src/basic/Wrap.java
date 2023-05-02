package basic;

public class Wrap {

	public static void main(String[] args) {
		// byte, short, int, long,float, double, boolean

		Wrap wr = new Wrap();
		wr.test1();

	}

	public void test1() {
		String st = "10";
		int a = Integer.parseInt(st);

		System.out.println(a);
		
		String st1 = "10.11";
		float f = Float.parseFloat(st1);
		System.out.println(f);
		
		String st2 = "12";
		byte b = Byte.parseByte(st2);
		System.out.println(b);
		
		//String <Default> "100"
		
		//Assert 100== 100 = true
		

	}

}
