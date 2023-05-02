package prac;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dat {

	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println(dt);
		SimpleDateFormat sd = new SimpleDateFormat("dd/mm/yyyy hh-mm");
		String myDate = sd.format(dt);
		System.out.println(myDate);
		
	}

}
