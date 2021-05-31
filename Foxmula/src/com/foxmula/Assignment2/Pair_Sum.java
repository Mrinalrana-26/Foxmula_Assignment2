package com.foxmula.Assignment2;

import java.util.*;

public class Pair_Sum {
	static ArrayList<Integer> h = new ArrayList<Integer>();
	 static boolean findnumbers(ArrayList<Integer> arr, int size,int sum) {
		Collections.sort(arr);
		int l=0;
		int r=size-1;
		while(l<r) {
			if(arr.get(l)+arr.get(r) == sum) {
				System.out.println("The Pair  is ("+ arr.get(l)+ ","+arr.get(r)+ ")" );
				return true;
			}
			else if(arr.get(l)+arr.get(r) < sum)
				l++;
			else if(arr.get(l)+arr.get(r) > sum)
				r--;
		}
		return false;
	}
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner (System.in);
		 System.out.println("enter the value first ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		 System.out.println("enter the number whoose pair is to find : ");
		 int sum = sc.nextInt();

		
	 	h.add(n1);
	    h.add(n2);
	    h.add(n3);
	    h.add(n4);
	    h.add(n5);
	    int size=h.size();
	    findnumbers(h,size,sum);
	    sc.close();
}
	
}