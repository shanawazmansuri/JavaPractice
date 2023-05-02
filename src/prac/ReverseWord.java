package prac;

public class ReverseWord {

	public static void main(String[] args) {

		String name = "Welcome to Java";

		String rev = "";

		String[] str = name.split(" ");

		for (String st : str) {

			StringBuffer stb = new StringBuffer(st);
			String newSt = stb.reverse().toString();

			rev = rev + newSt + " ";

		}

		System.out.println(rev);

	}

}
