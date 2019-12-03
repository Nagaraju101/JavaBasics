package com.sdet.basics;

public class DataConversions {
	
	public static void main(String[] args) {
		String x = "100";
		System.out.println(x+10);
		int y = Integer.parseInt(x);
		System.out.println(10+y);
//		String s = "100A";
//		int t = Integer.parseInt(s);
//		System.out.println(t + 10);//We will get Number formate exception. 
		
		String s2 = "12.33";
		System.out.println(s2 + 20);
	
		double d = Double.parseDouble(s2);
		System.out.println(d + 20);
		
		int i = 100;
		System.out.println(i + 20);
		
		String s3 = String.valueOf(i);
		System.out.println(s3 + 100);
		
	}

}
