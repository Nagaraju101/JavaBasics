package com.sdet.basics;

public class LoopsConcept 
{
	//1. While loop
	public static int whileLoop()
	{	int x = 0 ;
		while(x < 10 ) 
		{
			System.out.println(x);
			x = x+1;
		}
		return x;
	}	
	//2. For loop print odd numbers in the console
	public static int forLoop() 
	{	int i; 
		for ( i = 1; i<=10; i = i+2) {
			System.out.println(i);
		}
		return i;
	}
	
	//2. For loop print Even numbers in the console
		public static int forLoopEvenNumbers() 
		{	int i; 
			for ( i = 0; i<=10; i = i+2) {
				System.out.println(i);
			}
			return i;
		}
	
	public static void main(String[] args) {
		forLoop();
		forLoopEvenNumbers();
	}
	
	

}
