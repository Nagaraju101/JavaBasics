package com.sdet.basics;

public class TestingHere
{

    
    public static void main(String[] args){
    	
    	System.out.println("This is for SDET purpose  : ");	
        StringConcept stringConcat = new StringConcept();
        ForLoopConcept loopConcept = new ForLoopConcept();
        ArrayConcept arrayConcept = new ArrayConcept();
        IncrementDecrementConcept incrementDecrement = new IncrementDecrementConcept();
        System.out.println(stringConcat.getA() + stringConcat.getB());
        System.out.println(stringConcat.getC()+ stringConcat.getD());
    
        System.out.println(loopConcept.doWhileLoop());
        System.out.println(loopConcept.forLoopDecrement());
        System.out.println(loopConcept.forLoopIncrement());
        
        System.out.println(arrayConcept.intArray()) ;
        System.out.println(arrayConcept.doublArray());
        System.out.println(arrayConcept.stringArray());
        System.out.println(arrayConcept.objectArray());
        System.out.println(incrementDecrement.incrementDecrement());
        

     
    }
}