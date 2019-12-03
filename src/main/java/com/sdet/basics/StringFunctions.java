package com.sdet.basics;

import java.util.Date;

<<<<<<< HEAD
public class StringFunctions 
{
	
	public void stringUsages()
	{
		
	}
	
	public static void main(String[] args) 
	{
		Date date = new Date();
		System.out.println(date);
	}

}
=======
public class StringFunctions {
	Date date = new Date();
	public int stringLength() {
		int i = 0;
		String str = "Your transaction is approved successfully";
		i = str.length();
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf("r"));// Finding first 'r' index

		System.out.println(str.charAt(6));
		
		System.out.println(str.indexOf("r", str.indexOf("r")+1)); //Finding second 'r' index 
		System.out.println(str.charAt(23));
		System.out.println("This is 3rd R index: " + str.indexOf("r", str.indexOf("r", str.indexOf("s"))));// Finding third 'r' index
		 
		// string that doesn't exit
		System.out.println(str.indexOf("Hello"));
		
		//trim 
		
		String s = "  Hello World  ";
	    s = s.trim();
	    System.out.println(s.trim());
	    
	    //Replace
		System.out.println(s.replace(" ", ""));
		String date = "11-12-2019";
		System.out.println(date.replace("-", "/"));
		System.out.println(dateFormat(date));
		
		//Find index of word starting of
		System.out.println(str.indexOf("approved"));
		
		//String that doesn't exist
		System.out.println(str.indexOf("Hello"));
		
		//Substring
		System.out.println(str.substring(5,16));
		
		
		
		return i;  
	}
		//Date format replace value
		public String dateFormat(String date ) 
		{
			return date.replace("-", "/");
		}
		
		public boolean stringCompare(String str) 
		{
			Boolean bool = false; 
			if ( str.indexOf("Naga") > 0 ) {
				bool = true;
			}
			else {
				bool = false;
			}
			return bool; 
		}
		
		// Sub string value
		public String getSubStringValue(String s1)
		{
			s1 = s1.substring(s1.length()-6, s1.length()-0);
			return s1;
		}
		
		//String equals
		public Boolean stringEquals(String s1 , String s2) {
			Boolean bool = false;
			
			if(s1.equals(s2)) {
				bool = true;
			}
			else 
			{
				bool = false;
			}			
			return bool;
		}
		
		//Contains
		public Boolean stringContain(String s, String w)
		{
			Boolean bool = false;
			if(s.contains(w))
			{
				bool = true;
			}
			else 
			{
				bool = false;
			}
			return bool;
			
		}
		
		//Split
		public String[] stringSplit(String s)
		{
			String[] strArray = s.split("-");
			for ( int i = 0; i< strArray.length; i++)
			{
				System.out.println(strArray[i]);
			}
			return strArray;
		}
		
		public String getFullName(String s)
		{	
			String[] s1 = s.split("-");
			String fullName = s1[0]+ " " +s1[1];
			return fullName;
		}
}


>>>>>>> master
