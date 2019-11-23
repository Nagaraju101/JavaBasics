package com.sdet.basics;

import java.util.ArrayList;

public class MethodsInJava 
{
	//1. No input no return
	
	public void test() {
		System.out.println("No input or No return method");
	}
	
	
	//2. No input but return some value
	public int sum() 
	{
		System.out.println("Sum Method");
		int a = 19;
		int b = 21;
		return  (a+b);
	}
	
	public ArrayList<String> getStudentNames()
	{
		System.out.println("Getting student names method");
		ArrayList<String> arList = new ArrayList<String>();
		arList.add("Avi");
		arList.add("Lucky");
		arList.add("Sanju");
		arList.add("naga");
		return arList;
	}
	
	//3. Giving input and return some value
	public int devision(int x , int y )
	{
		x = 44;
		y = 56; 
		int div = y/x;
		return div ;
	}
	
	//4. Multiple return statement
	public String getContryName(String cityName)
	{
		System.out.println("Get city name");
		if ( cityName.equalsIgnoreCase("Hyderabad"))
		{
			return "India";
		}else if ( cityName.equalsIgnoreCase("London"))
		{
			return "UK";
		}else if (cityName.equalsIgnoreCase("Denver"))
		{
			return "USA";
		}else {
			return cityName + ". The city name will be added soon";
			
		}
	}
	
}
