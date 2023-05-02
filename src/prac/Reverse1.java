package prac;

public class Reverse1 {

	public static void main(String[] args) {

		// **************************************************************************************************//
		int num = 123456;

		StringBuffer str = new StringBuffer(String.valueOf(num));

		System.out.println(str.reverse());
		
		String rev = "";
		String newSrt = String.valueOf(num);
		char[] cha = newSrt.toCharArray();
		
		for(int i=cha.length-1;i>=0;i--)
		{
			rev = rev+cha[i];
		}
		
		System.out.println(rev);

//**************************************************************************************************//		
		String st = "Shanawaz";

		StringBuffer ss = new StringBuffer(st);

		System.out.println(ss.reverse());

//**************************************************************************************************//				
		String reverse = "";
		char[] ch = st.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			reverse = reverse + ch[i];
		}

		System.out.println(reverse);

	}

}
