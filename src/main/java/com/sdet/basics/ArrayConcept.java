package com.sdet.basics;

public class ArrayConcept {

    public boolean[] booleanArray() {
        boolean b[] = new boolean[2];
        b[0] = false;
        b[1] = true;
        System.out.println(b[1]);
        return(b);
    }
    

    public int[] intArray()
    {       int i[] = new int[2];
        i[0] = 4;
        i[1] = 8;
        System.out.println(i[1]);
        return(i);
    }

    public double[] doublArray() {
        double d[]= new double[3];
        d[0] = 1.1;
        d[1] = 2.2;
        d[2] = 3.3;
        System.out.println(d[2]);
        return (d); 
     }

     public String[] stringArray() {
        String string[] = new String[2];
        string[0] = "naga";
        string[1] = "raju";
        System.out.println(string[0]);
        return (string);

     }

    public Object[] objectArray() {
        Object obj[] = new Object[6];
        obj[0] = "naga";
        obj[1] = 38;
        obj[2] = 2.2;
        obj[3] = 01-01-2020;
        obj[4] = 'M';
        obj[5] = false;
        System.out.println(obj[0]);
        return (obj);
    }


 }
