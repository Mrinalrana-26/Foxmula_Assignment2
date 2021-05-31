package com.foxmula.Assignment2;
import java.util.*;
public class Testtreeset {
		TreeSet<Integer> h = new TreeSet<Integer>();
	
    public Testtreeset (int n1, int n2, int n3, int n4)
    {
	    h.add(n1);
	    h.add(n2);
	    h.add(n3);
	    h.add(n4); 
	   
    }
    
    void traverse()
    {
    	
        Iterator<Integer> itr = h.iterator();
  

        System.out.println("value are ");
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
