package basic;

public class Excep {

	public static void main(String[] args) {

		Excep ex = new Excep();
		//ex.test();
		ex.test2();

		// Exception is unwanted situation occured at runtime which interupts normal
		// execution of program
		// try catch
		// throw/throws
		// finally
		// checked
		// unchecked

	}

	public void test() {
		System.out.println("My Program starts");
		try {

			// int b = 10 / 0;
			// String name = null;
			// name.toUpperCase();

			int[] a = new int[2];
			a[5] = 10;

			// Exception Match
		}

		catch (NullPointerException e) {
			System.out.println("I am into Null Pointer Exception");
		}

		catch (ArithmeticException e) {
			System.out.println("I am into Arithmetic Exception");
		}

		catch (Exception e) {
			System.out.println("I am into Exception");
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}

		System.out.println("My Program end");
	}
	
	
	//Nested Try Catch Block
	public void test2()
	{
		System.out.println("Program Starts");
		
		try
		{
			int a = 10/0;
			
			try
			{
				System.out.println("Nested Program Starts");
				
				int[] c = new int[2];
				c[10] = 10;
			}
			
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			System.out.println("Nested Program Ends");
			
		}
		catch(Exception a)
		{
			
			System.out.println(a);
		}
		
		System.out.println("Program End");
		
		
	}

}
