package com.foxmula.Assignment2;

import java.util.HashSet;
import java.util.Iterator;

public class Testhashset {
	
	 
	HashSet<Integer> set=new HashSet<Integer>();  
	
    public Testhashset (int s1, int s2, int  s3, int  s4)
    {
    	set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
    }
    
    void traverse()
    {
    	 System.out.println("value are ");
    	Iterator<Integer> itr=set.iterator();    
    	while(itr.hasNext())
        {    
           System.out.println(itr.next());    
         
        }  
    }
}