package HashMapConcept;

import java.util.HashMap;

public class Data {
	
	public static HashMap<String, String> getUserLogin()
	{
		
		HashMap<String, String> usermap=new HashMap<String,String>();
		
		usermap.put("Admin","Admin_admin@123");
		usermap.put("Customer", "ram6666_powers123");
		
		return usermap;	
		
		}
	
	
	public static HashMap<String, String> getMonth()
	{
         HashMap<String, String> usermonth=new HashMap<String,String>();
		
		usermonth.put("1","January");
		usermonth.put("2", "February");
		usermonth.put("3", "March");
		usermonth.put("4", "April");
		usermonth.put("5", "May");
		usermonth.put("6", "June");
		usermonth.put("7", "July");
		usermonth.put("8", "August");
		usermonth.put("9", "September");
		usermonth.put("10", "October");
		usermonth.put("11", "November");
		usermonth.put("12", "December");
		
		return usermonth;	
		
		}
		
		
		
		
	}
	


