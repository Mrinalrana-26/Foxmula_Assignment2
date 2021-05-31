package com.foxmula.Assignment2;
import java.util.*;

	
	
public class Hashset 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the value:");
		Scanner sc = new Scanner(System.in);
		int  n1 = sc.nextInt();
		int  n2 = sc.nextInt();
		int  n3 = sc.nextInt();
		int  n4 = sc.nextInt();
	
		
		Testhashset  t = new Testhashset(n1,n2,n3,n4);
		
		   
		t.traverse();
		
		sc.close();
		
	}

}
