package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Except {
	
	//throw keyword is used to throw the exception explicitly into the code
	//throws is used in method signature to declare an exception while executing the code
	//checked exception:- At the time of code compilation
	//uncheck exception:- At runtime
	//finally - Will execute everytime whether exception occurs or not
	
	public static void main(String[] args) throws VotingException {
		
		Except ex = new Except();
		//ex.voting(12);
		ex.test2();
		
		try {
			ex.test1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void voting(int age) throws VotingException
	{
		if(age<18)
		{
			//Explicitly
			throw new VotingException("User not allow to vote below 18");
			
		}
		else
		{
			System.out.println("Allow to vote");
		}
	}
	
	public void test1() throws FileNotFoundException 
	{
		File fl = new File("D:\\");
		try
		{
		FileInputStream foi = new FileInputStream(fl);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		FileOutputStream fos = new FileOutputStream(fl);
		
	}
	
	public void test2()
	{
		try {
			int a = 10/2;
			System.out.println(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("I am inside finally");
			//Disconnect connectivity
			
			
		}
		
	}

}
