package com.sdet.basics;

import java.util.ArrayList;

public class TestingHere
{

    
    public static void main(String[] args)
    {
    	
    	System.out.println("This is for SDET purpose  : ");	
    	
        StringConcept stringConcat = new StringConcept();
        ForLoopConcept loopConcept = new ForLoopConcept();
        ArrayConcept arrayConcept = new ArrayConcept();
        MethodsInJava obj  = new MethodsInJava();
        IncrementDecrementConcept incrementDecrement = new IncrementDecrementConcept();
        StaticNonStatic staticNonStatic = new StaticNonStatic();
        
        System.out.println(stringConcat.getA() + stringConcat.getB());
        System.out.println(stringConcat.getC()+ stringConcat.getD());
    
        System.out.println(loopConcept.doWhileLoop());
        System.out.println(loopConcept.forLoopDecrement());
        System.out.println(loopConcept.forLoopIncrement());
        
        System.out.println(arrayConcept.intArray()) ;
        System.out.println(arrayConcept.doublArray());
        System.out.println(arrayConcept.stringArray());
        System.out.println(arrayConcept.objectArray());
        
        
        obj.test();
        obj.getStudentNames();
        System.out.println(obj.devision(55, 7));
        System.out.println(obj.getCountryName("Denver"));
         
        
        System.out.println(incrementDecrement.incrementDecrement());
        
        ArrayList<String> s = obj.getStudentNames();
        for (int j = 0; j < s.size() ; j++ ) 
        {
        	System.out.println(s.get(j));
        	
        }
      
        int marks[] = obj.getMarks();
        for(int i = 0; i < marks.length; i++)
        {
        	System.out.println(marks[i]);
        }
        
        System.out.println(StaticNonStatic.age + " years and " + staticNonStatic.days + " days");
        
        StaticNonStatic.distanceFromHome();
        
        //System.out.println(arrayConcept.arrayIndexOutOfBoundaryException());
        
        System.out.println(obj.getMarks());
       

     
    }
}