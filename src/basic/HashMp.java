package basic;

import java.util.HashMap;
import java.util.Map;

public class HashMp {

	public static void main(String[] args) {
		
		//Used to store data in key and value combination
		//Key should be always unique
		// It should accept duplicate values
		// It does not maintain insertion order
		// It should accept only 1 null Key
		// It should accept multiple null values
		
		
		Map<String,Object> hp = new HashMap<String,Object>();
		hp.put("FirstName", null);
		hp.put("MiddleName", null);
		hp.put("LastName", "Mansuri");
		hp.put("NickName", "Mansuri");
		//hp.put(null, "ABC");
		hp.put(null, "DEF");
		
	//	System.out.println(hp.remove("Age"));
		
		//hp.replace("FirstName", "XYZ");
		//hp.remove("FirstName");
		/*
		 * System.out.println(hp); System.out.println(hp.size());
		 */
		
		/*
		 * for(String str: hp.keySet()) { System.out.println(str); }
		 */
		
		/*
		 * for(Object str: hp.values()) { System.out.println(str); }
		 */
		
		System.out.println(hp);

	}

}
