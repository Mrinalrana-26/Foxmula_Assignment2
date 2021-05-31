package com.foxmula.Assignment2;
import java.util.*;
public class Arraylist {
	
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner (System.in);
		 System.out.println("enter the value ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		 System.out.println("enter the number to be find: ");
		 int x = sc.nextInt();
		ArrayList<Integer> h = new ArrayList<Integer>();
		
	 	h.add(n1);
	    h.add(n2);
	    h.add(n3);
	    h.add(n4);
	    h.add(n5);
	    if (h.contains(x))
            System.out.println("number present in the ArrayList");
  
        else
            System.out.println("number is not present  in the ArrayList");
  
		
		sc.close();
		
	}
}
