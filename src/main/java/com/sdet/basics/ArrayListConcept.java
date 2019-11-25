package com.sdet.basics;

import java.util.ArrayList;

public class ArrayListConcept
{
	
	public void arrayListMethod() 
	{
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());
		
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
		//System.out.println(ar.get(4));
		
		ar.remove(2);
		ar.add(300.00);
		ar.add('n');
		ar.add("naga");
		
		for ( int i=0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		//If want restrict to only integer Array
		
		ArrayList<Integer> arInt = new ArrayList<Integer>();
		arInt.add(222);
		arInt.add(333);
		arInt.add(111);
		arInt.add(444);
		System.out.println(arInt.size());
		System.out.println(arInt.get(1));
		

		
		//If want restrict to only String Array
		
		ArrayList<String> arStr = new ArrayList<String>();
		arStr.add("Naga");
		arStr.add("Sanju");
		arStr.add("Lucky");
		arStr.add("Avi");
		
		System.out.println(arStr.get(3));
		
		
		
		
		
	}
	

}
