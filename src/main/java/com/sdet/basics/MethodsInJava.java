package com.sdet.basics;

import java.util.ArrayList;

public class MethodsInJava 
{
	
	
	//No input but return some value
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

}
