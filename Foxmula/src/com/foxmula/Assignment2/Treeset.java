package com.foxmula.Assignment2;
import java.util.*;
public class Treeset {
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the value:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
	
		Testtreeset  t = new Testtreeset(n1,n2,n3,n4);
		
		   
		t.traverse();
		
		sc.close();
	
	}
}
