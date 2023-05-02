package prac;

public class MissingNo {
	
	public static void main(String[] args) {
		
		int[] num = {1,2,3,5};
		
		int sum1=0;
		
		for(int i=0;i<num.length;i++)
		{
			sum1 = sum1+num[i];
		}
		
		System.out.println("Sum is "+sum1);
		
		int sum2 = 0;
		
		for(int j=1; j<=5;j++)
		{
			sum2 = sum2+j;
		}
	
		System.out.println("Sum2 is "+sum2);
		
		int miss = sum2-sum1;
		
		System.out.println("Missing no is "+miss);
		
	}

}
