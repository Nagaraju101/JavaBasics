package com.sdet.basics;

import java.util.ArrayList;

public class MethodsInJava 
{
	static String name = "naga";
	public static void main(String[] args)
	{
		MethodsInJava obj = new MethodsInJava();
		obj.test();
		System.out.println(MethodsInJava.name);
	}
	//1. No input no return
	
	public void test() {
		System.out.println("This is just Test method only. No input or No return method");
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
	
	public int[] getMarks() 
	{
		System.out.println("Get Marks method");
		int i[] = new int[4];
		i[0] = 77;
		i[1] = 78;
		i[2] = 79;
		i[3] = 88;
		return i;
		
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
	public String getCountryName(String cityName)
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
