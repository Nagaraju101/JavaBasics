package com.sdet.basics;

public class IncrementDecrementConcept
{
	public int incrementDecrement()
	{
		int i = 10;
		int j = i++ ; // post increment
		System.out.println("The value of i :" + i);
		System.out.println("The value of j :" + j);
		
		int m = 20 ;
		int n = ++m; // pre-increment
		System.out.println("The value of m :" + m);
		System.out.println("The value of n :" + n);
		
		int p = 30 ;
		int q = p--; // post decrement
		System.out.println("The value of p :" + p);
		System.out.println("The value of q :" + q);
		
		int x = 40;  
		int y = --x; // pre decrement
		System.out.println("The value of x :" + x);
		System.out.println("The value of y :" + y);
		return  (i) + (j) + (m) + (n) + (p) +(q) + (x) + (y);
	}
	
}
