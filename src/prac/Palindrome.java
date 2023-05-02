package prac;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String str = "MADAM";
		
		String rev = "";
		
		char[] ch = str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			rev = rev+ch[i];
		}
		
		
		
		if(str.equals(rev)) {
			
			System.out.println("Its Palendrome");
		}
		
		else
		{
			System.out.println("Its not Pelendrome");
		}
		
	}

}
