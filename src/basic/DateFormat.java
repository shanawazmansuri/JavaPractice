package basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	
	public static void main(String[] args) {
		
		Date dt = new Date();
		System.out.println(dt);
		
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		String newDate = sd.format(dt);
		System.out.println(newDate);
		
	}

}
