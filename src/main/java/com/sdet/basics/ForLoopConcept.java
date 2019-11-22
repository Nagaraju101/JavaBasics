package com.sdet.basics;

public class ForLoopConcept {

	//public ForLoopConcept() {

	//}

	public int doWhileLoop() {
	    int i = 0; 
	    while( i < 10 ){
	        System.out.println(i);
	        i =i+1;
	    }
	    return i;
	   
	}

	public int forLoopDecrement() {
	    int i ; 
	    for ( i = 10 ;  i >= 1; i--){
	        System.out.println(i);
	    }
	    return i;
	}
	
	public int forLoopIncrement() {
		
		int i ;
		for( i = 1; i < 10; i++) {
			System.out.println(i);
		}
		
		return i; 
	}

	}
