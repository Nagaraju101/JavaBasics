package com.sdet.basics;

import java.util.ArrayList;

public class ArrayConcept
{

    public boolean[] booleanArray()
    {
        boolean b[] = new boolean[2];
        b[0] = false;
        b[1] = true;
        System.out.println(b[1]);
        return (b);
    }

    public int[] intArray()
    {
        int i[] = new int[2];
        i[0] = 4;
        i[1] = 8;
        System.out.println(i[1]);
        return (i);
    }

    public int[] arrayIndexOutOfBoundaryException()
    {
        int i[] = new int[2];
        i[0] = 4;
        i[1] = 8;
        System.out.println(i[2]);
        return (i);
    }

    public double[] doublArray()
    {
        double d[] = new double[3];
        d[0] = 1.1;
        d[1] = 2.2;
        d[2] = 3.3;
        System.out.println(d[2]);
        return (d);
    }

    public String[] stringArray()
    {
        String string[] = new String[2];
        string[0] = "nagaR";
        string[1] = "raju";
        for(int i =0; i< string.length; i++) {
            System.out.println(string[i].toString());
        }
       
        return string  ;

    }

    public Object[] objectArray()
    {
        Object obj[] = new Object[6];
        obj[0] = "naga";
        obj[1] = 38;
        obj[2] = 2.2;
        obj[3] = 01 - 01 - 2020;
        obj[4] = 'M';
        obj[5] = false;
        System.out.println(obj[0]);
        return (obj);
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
        System.out.println("Getting Marks method");
        int marks[] = new int[3];
        marks[0] = 78;
        marks[1] = 82;
        marks[2] = 93;
        for (int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }
        return marks;
    }

    public ArrayList<String> addAllValues()
    {
        ArrayList<String> str1 = new ArrayList<String>();
        str1.add("Sanju");
        str1.add("naga");

        ArrayList<String> str2 = new ArrayList<String>();
        str2.add("Lucky");
        str2.add("Avi");

        str1.addAll(str2);

        for (int i = 0; i < str1.size(); i++)
        {
            System.out.println(str1.get(i));
        }

        return str1;
    }

}
